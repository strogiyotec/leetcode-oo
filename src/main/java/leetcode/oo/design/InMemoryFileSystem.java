package leetcode.oo.design;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

//https://leetcode.com/problems/design-in-memory-file-system/
public final class InMemoryFileSystem {

    private final InMemoryFile root;

    public InMemoryFileSystem() {
        this.root = InMemoryFile.createDir("/");
    }

    public List<String> ls(String path) {
        InMemoryFile temp = this.root;
        final String[] split = path.split("/");
        for (final String subDir : split) {
            temp = temp.get(subDir);
        }
        if (!temp.isDir) {
            return Collections.singletonList(temp.path);
        } else {
            return StreamSupport
                .stream(temp.childrenPaths().spliterator(), false)
                .collect(Collectors.toList());
        }
    }

    public void mkdir(final String path) {
        InMemoryFile temp = this.root;
        final String[] parts = path.split("/");
        for (final String part : parts) {
            final InMemoryFile file = temp.get(part);
            if (file == null) {
                temp.addSubSir(part);
            }
            temp = temp.get(part);
        }
    }

    public String readContent(final String path) {
        final String[] parts = path.split("/");
        InMemoryFile temp = this.root;
        //skip the last one
        for (int i = 0; i < parts.length; i++) {
            final String part = parts[i];
            final InMemoryFile file = temp.get(part);
            if (file == null) {
                temp.addSubSir(part);
            }
            temp = temp.get(part);
        }
        final String fileName = parts[parts.length - 1];
        return temp.get(fileName).readContent();
    }

    public void addContent(final String path, final String content) {
        final String[] parts = path.split("/");
        InMemoryFile temp = this.root;
        //skip the last one
        for (int i = 0; i < parts.length; i++) {
            final String part = parts[i];
            final InMemoryFile file = temp.get(part);
            if (file == null) {
                temp.addSubSir(part);
            }
            temp = temp.get(part);
        }
        final String fileName = parts[parts.length - 1];
        temp.addFile(fileName, content);
    }

    static final class InMemoryFile {
        private final Map<String, InMemoryFile> children = new HashMap<>();
        private final boolean isDir;
        private String content;
        private final String path;

        public static InMemoryFileSystem.InMemoryFile createFile(final String path) {
            return new InMemoryFileSystem.InMemoryFile(
                false,
                null,
                path
            );
        }

        public static InMemoryFileSystem.InMemoryFile createDir(final String path) {
            return new InMemoryFileSystem.InMemoryFile(
                true,
                null,
                path
            );
        }

        public InMemoryFile(final boolean isDir, final String content, final String path) {
            this.isDir = isDir;
            this.content = content;
            this.path = path;
        }

        public InMemoryFile get(final String path) {
            return this.children.get(path);
        }

        public void addFile(final String path, final String content) {
            if (!this.children.containsKey(path)) {
                this.children.put(path, new InMemoryFile(false, content, path));
            } else {
                final InMemoryFile file = this.children.get(path);
                if (file.content == null) {
                    file.content = content;
                } else {
                    file.content += content;
                }
            }
        }

        public void addSubSir(final String path) {
            this.children.put(
                path,
                InMemoryFile.createDir(path)
            );
        }

        public void append(final String path) {
            if (this.content == null) {
                this.content = path;
            } else {
                this.content += path;
            }
        }

        public Iterable<String> childrenPaths() {
            return this.children.keySet();
        }

        public String readContent() {
            return this.content;
        }
    }
}
