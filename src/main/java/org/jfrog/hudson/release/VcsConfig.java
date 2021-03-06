package org.jfrog.hudson.release;

import java.io.Serializable;

/**
 * @author Noam Y. Tenne
 */
public class VcsConfig implements Serializable {

    private boolean useReleaseBranch;
    private String releaseBranchName;
    private boolean createTag;
    private String tagUrlOrName;
    private String releaseCommitComment;
    private String nextDevelopmentVersionComment;

    public VcsConfig(boolean useReleaseBranch, String releaseBranchName, boolean createTag, String tagUrlOrName,
            String releaseCommitComment, String nextDevelopmentVersionComment) {
        this.useReleaseBranch = useReleaseBranch;
        this.releaseBranchName = releaseBranchName;
        this.createTag = createTag;
        this.tagUrlOrName = tagUrlOrName;
        this.releaseCommitComment = releaseCommitComment;
        this.nextDevelopmentVersionComment = nextDevelopmentVersionComment;
    }

    public boolean isUseReleaseBranch() {
        return useReleaseBranch;
    }

    public String getReleaseBranchName() {
        return releaseBranchName;
    }

    public boolean isCreateTag() {
        return createTag;
    }

    public String getTagUrlOrName() {
        return tagUrlOrName;
    }

    public String getReleaseCommitComment() {
        return releaseCommitComment;
    }

    public String getNextDevelopmentVersionComment() {
        return nextDevelopmentVersionComment;
    }
}
