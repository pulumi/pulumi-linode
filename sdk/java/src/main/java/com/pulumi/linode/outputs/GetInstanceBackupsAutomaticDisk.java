// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceBackupsAutomaticDisk {
    /**
     * @return The filesystem of this disk.
     * 
     */
    private final String filesystem;
    /**
     * @return The label of this disk.
     * 
     */
    private final String label;
    /**
     * @return The size of this disk.
     * 
     */
    private final Integer size;

    @CustomType.Constructor
    private GetInstanceBackupsAutomaticDisk(
        @CustomType.Parameter("filesystem") String filesystem,
        @CustomType.Parameter("label") String label,
        @CustomType.Parameter("size") Integer size) {
        this.filesystem = filesystem;
        this.label = label;
        this.size = size;
    }

    /**
     * @return The filesystem of this disk.
     * 
     */
    public String filesystem() {
        return this.filesystem;
    }
    /**
     * @return The label of this disk.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return The size of this disk.
     * 
     */
    public Integer size() {
        return this.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceBackupsAutomaticDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filesystem;
        private String label;
        private Integer size;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceBackupsAutomaticDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filesystem = defaults.filesystem;
    	      this.label = defaults.label;
    	      this.size = defaults.size;
        }

        public Builder filesystem(String filesystem) {
            this.filesystem = Objects.requireNonNull(filesystem);
            return this;
        }
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }        public GetInstanceBackupsAutomaticDisk build() {
            return new GetInstanceBackupsAutomaticDisk(filesystem, label, size);
        }
    }
}
