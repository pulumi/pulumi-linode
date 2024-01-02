// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class SshKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SshKeyArgs Empty = new SshKeyArgs();

    /**
     * A label for the SSH Key.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return A label for the SSH Key.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
     * 
     */
    @Import(name="sshKey", required=true)
    private Output<String> sshKey;

    /**
     * @return The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
     * 
     */
    public Output<String> sshKey() {
        return this.sshKey;
    }

    private SshKeyArgs() {}

    private SshKeyArgs(SshKeyArgs $) {
        this.label = $.label;
        this.sshKey = $.sshKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshKeyArgs $;

        public Builder() {
            $ = new SshKeyArgs();
        }

        public Builder(SshKeyArgs defaults) {
            $ = new SshKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param label A label for the SSH Key.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label A label for the SSH Key.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param sshKey The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
         * 
         * @return builder
         * 
         */
        public Builder sshKey(Output<String> sshKey) {
            $.sshKey = sshKey;
            return this;
        }

        /**
         * @param sshKey The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
         * 
         * @return builder
         * 
         */
        public Builder sshKey(String sshKey) {
            return sshKey(Output.of(sshKey));
        }

        public SshKeyArgs build() {
            if ($.label == null) {
                throw new MissingRequiredPropertyException("SshKeyArgs", "label");
            }
            if ($.sshKey == null) {
                throw new MissingRequiredPropertyException("SshKeyArgs", "sshKey");
            }
            return $;
        }
    }

}
