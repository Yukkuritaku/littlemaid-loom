package io.github.yukkuritaku.loom.task;

import io.github.yukkuritaku.loom.extension.LittleMaidLoomExtension;
import io.github.yukkuritaku.loom.util.MaidConstants;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Internal;

public abstract class AbstractMaidTask extends DefaultTask {

    public AbstractMaidTask(){
        setGroup(MaidConstants.MAID_GRADLE);
    }

    @Internal
    protected LittleMaidLoomExtension getMaidExtension() {
        return getProject().getExtensions().getByType(LittleMaidLoomExtension.class);
    }
}
