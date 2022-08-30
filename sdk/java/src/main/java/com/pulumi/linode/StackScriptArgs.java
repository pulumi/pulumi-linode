// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.StackScriptUserDefinedFieldArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StackScriptArgs extends com.pulumi.resources.ResourceArgs {

    public static final StackScriptArgs Empty = new StackScriptArgs();

    /**
     * A description for the StackScript.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return A description for the StackScript.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
     * 
     */
    @Import(name="images", required=true)
    private Output<List<String>> images;

    /**
     * @return An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
     * 
     */
    public Output<List<String>> images() {
        return this.images;
    }

    /**
     * This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `is_public` forces the creation of a new StackScript*
     * 
     */
    @Import(name="isPublic")
    private @Nullable Output<Boolean> isPublic;

    /**
     * @return This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `is_public` forces the creation of a new StackScript*
     * 
     */
    public Optional<Output<Boolean>> isPublic() {
        return Optional.ofNullable(this.isPublic);
    }

    /**
     * The StackScript&#39;s label is for display purposes only.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The StackScript&#39;s label is for display purposes only.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * This field allows you to add notes for the set of revisions made to this StackScript.
     * 
     */
    @Import(name="revNote")
    private @Nullable Output<String> revNote;

    /**
     * @return This field allows you to add notes for the set of revisions made to this StackScript.
     * 
     */
    public Optional<Output<String>> revNote() {
        return Optional.ofNullable(this.revNote);
    }

    /**
     * The script to execute when provisioning a new Linode with this StackScript.
     * 
     */
    @Import(name="script", required=true)
    private Output<String> script;

    /**
     * @return The script to execute when provisioning a new Linode with this StackScript.
     * 
     */
    public Output<String> script() {
        return this.script;
    }

    /**
     * This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
     * 
     */
    @Import(name="userDefinedFields")
    private @Nullable Output<List<StackScriptUserDefinedFieldArgs>> userDefinedFields;

    /**
     * @return This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
     * 
     */
    public Optional<Output<List<StackScriptUserDefinedFieldArgs>>> userDefinedFields() {
        return Optional.ofNullable(this.userDefinedFields);
    }

    private StackScriptArgs() {}

    private StackScriptArgs(StackScriptArgs $) {
        this.description = $.description;
        this.images = $.images;
        this.isPublic = $.isPublic;
        this.label = $.label;
        this.revNote = $.revNote;
        this.script = $.script;
        this.userDefinedFields = $.userDefinedFields;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StackScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StackScriptArgs $;

        public Builder() {
            $ = new StackScriptArgs();
        }

        public Builder(StackScriptArgs defaults) {
            $ = new StackScriptArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description for the StackScript.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for the StackScript.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param images An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
         * 
         * @return builder
         * 
         */
        public Builder images(Output<List<String>> images) {
            $.images = images;
            return this;
        }

        /**
         * @param images An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
         * 
         * @return builder
         * 
         */
        public Builder images(List<String> images) {
            return images(Output.of(images));
        }

        /**
         * @param images An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
         * 
         * @return builder
         * 
         */
        public Builder images(String... images) {
            return images(List.of(images));
        }

        /**
         * @param isPublic This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `is_public` forces the creation of a new StackScript*
         * 
         * @return builder
         * 
         */
        public Builder isPublic(@Nullable Output<Boolean> isPublic) {
            $.isPublic = isPublic;
            return this;
        }

        /**
         * @param isPublic This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `is_public` forces the creation of a new StackScript*
         * 
         * @return builder
         * 
         */
        public Builder isPublic(Boolean isPublic) {
            return isPublic(Output.of(isPublic));
        }

        /**
         * @param label The StackScript&#39;s label is for display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The StackScript&#39;s label is for display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param revNote This field allows you to add notes for the set of revisions made to this StackScript.
         * 
         * @return builder
         * 
         */
        public Builder revNote(@Nullable Output<String> revNote) {
            $.revNote = revNote;
            return this;
        }

        /**
         * @param revNote This field allows you to add notes for the set of revisions made to this StackScript.
         * 
         * @return builder
         * 
         */
        public Builder revNote(String revNote) {
            return revNote(Output.of(revNote));
        }

        /**
         * @param script The script to execute when provisioning a new Linode with this StackScript.
         * 
         * @return builder
         * 
         */
        public Builder script(Output<String> script) {
            $.script = script;
            return this;
        }

        /**
         * @param script The script to execute when provisioning a new Linode with this StackScript.
         * 
         * @return builder
         * 
         */
        public Builder script(String script) {
            return script(Output.of(script));
        }

        /**
         * @param userDefinedFields This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedFields(@Nullable Output<List<StackScriptUserDefinedFieldArgs>> userDefinedFields) {
            $.userDefinedFields = userDefinedFields;
            return this;
        }

        /**
         * @param userDefinedFields This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedFields(List<StackScriptUserDefinedFieldArgs> userDefinedFields) {
            return userDefinedFields(Output.of(userDefinedFields));
        }

        /**
         * @param userDefinedFields This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedFields(StackScriptUserDefinedFieldArgs... userDefinedFields) {
            return userDefinedFields(List.of(userDefinedFields));
        }

        public StackScriptArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.images = Objects.requireNonNull($.images, "expected parameter 'images' to be non-null");
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            $.script = Objects.requireNonNull($.script, "expected parameter 'script' to be non-null");
            return $;
        }
    }

}
