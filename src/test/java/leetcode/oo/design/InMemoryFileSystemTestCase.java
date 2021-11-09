package leetcode.oo.design;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class InMemoryFileSystemTestCase {

    private InMemoryFileSystem fileSystem;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.fileSystem = new InMemoryFileSystem();
    }

    @Test
    public void test() {
        this.fileSystem.mkdir("hello/world");
        this.fileSystem.addContent("hello/world/hello.txt", "Hello world");
        this.fileSystem.addContent("hello/world/salam.txt", "Hello world");
        final String content = this.fileSystem.readContent("hello/world/hello.txt");
        Assert.assertEquals(
            "Hello world",
            content
        );
        Assert.assertEquals(2, this.fileSystem.ls("hello/world").size());
    }
}
