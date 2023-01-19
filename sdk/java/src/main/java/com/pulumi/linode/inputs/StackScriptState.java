// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.StackScriptUserDefinedFieldArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StackScriptState extends com.pulumi.resources.ResourceArgs {

    public static final StackScriptState Empty = new StackScriptState();

    /**
     * The date this StackScript was created.
     * 
     */
    @Import(name="created")
    private @Nullable Output<String> created;

    /**
     * @return The date this StackScript was created.
     * 
     */
    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * Count of currently active, deployed Linodes created from this StackScript.
     * 
     */
    @Import(name="deploymentsActive")
    private @Nullable Output<Integer> deploymentsActive;

    /**
     * @return Count of currently active, deployed Linodes created from this StackScript.
     * 
     */
    public Optional<Output<Integer>> deploymentsActive() {
        return Optional.ofNullable(this.deploymentsActive);
    }

    /**
     * The total number of times this StackScript has been deployed.
     * 
     */
    @Import(name="deploymentsTotal")
    private @Nullable Output<Integer> deploymentsTotal;

    /**
     * @return The total number of times this StackScript has been deployed.
     * 
     */
    public Optional<Output<Integer>> deploymentsTotal() {
        return Optional.ofNullable(this.deploymentsTotal);
    }

    /**
     * A description for the StackScript.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for the StackScript.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * An array of Image IDs representing the Images that this StackScript is compatible for deploying with. `any/all` indicates that all available image distributions, including private images, are accepted. Currently private image IDs are not supported.
     * 
     */
    @Import(name="images")
    private @Nullable Output<List<String>> images;

    /**
     * @return An array of Image IDs representing the Images that this StackScript is compatible for deploying with. `any/all` indicates that all available image distributions, including private images, are accepted. Currently private image IDs are not supported.
     * 
     */
    public Optional<Output<List<String>>> images() {
        return Optional.ofNullable(this.images);
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
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The StackScript&#39;s label is for display purposes only.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
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
    @Import(name="script")
    private @Nullable Output<String> script;

    /**
     * @return The script to execute when provisioning a new Linode with this StackScript.
     * 
     */
    public Optional<Output<String>> script() {
        return Optional.ofNullable(this.script);
    }

    /**
     * The date this StackScript was updated.
     * 
     */
    @Import(name="updated")
    private @Nullable Output<String> updated;

    /**
     * @return The date this StackScript was updated.
     * 
     */
    public Optional<Output<String>> updated() {
        return Optional.ofNullable(this.updated);
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

    /**
     * The Gravatar ID for the User who created the StackScript.
     * 
     */
    @Import(name="userGravatarId")
    private @Nullable Output<String> userGravatarId;

    /**
     * @return The Gravatar ID for the User who created the StackScript.
     * 
     */
    public Optional<Output<String>> userGravatarId() {
        return Optional.ofNullable(this.userGravatarId);
    }

    /**
     * The User who created the StackScript.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The User who created the StackScript.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private StackScriptState() {}

    private StackScriptState(StackScriptState $) {
        this.created = $.created;
        this.deploymentsActive = $.deploymentsActive;
        this.deploymentsTotal = $.deploymentsTotal;
        this.description = $.description;
        this.images = $.images;
        this.isPublic = $.isPublic;
        this.label = $.label;
        this.revNote = $.revNote;
        this.script = $.script;
        this.updated = $.updated;
        this.userDefinedFields = $.userDefinedFields;
        this.userGravatarId = $.userGravatarId;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StackScriptState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StackScriptState $;

        public Builder() {
            $ = new StackScriptState();
        }

        public Builder(StackScriptState defaults) {
            $ = new StackScriptState(Objects.requireNonNull(defaults));
        }

        /**
         * @param created The date this StackScript was created.
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created The date this StackScript was created.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param deploymentsActive Count of currently active, deployed Linodes created from this StackScript.
         * 
         * @return builder
         * 
         */
        public Builder deploymentsActive(@Nullable Output<Integer> deploymentsActive) {
            $.deploymentsActive = deploymentsActive;
            return this;
        }

        /**
         * @param deploymentsActive Count of currently active, deployed Linodes created from this StackScript.
         * 
         * @return builder
         * 
         */
        public Builder deploymentsActive(Integer deploymentsActive) {
            return deploymentsActive(Output.of(deploymentsActive));
        }

        /**
         * @param deploymentsTotal The total number of times this StackScript has been deployed.
         * 
         * @return builder
         * 
         */
        public Builder deploymentsTotal(@Nullable Output<Integer> deploymentsTotal) {
            $.deploymentsTotal = deploymentsTotal;
            return this;
        }

        /**
         * @param deploymentsTotal The total number of times this StackScript has been deployed.
         * 
         * @return builder
         * 
         */
        public Builder deploymentsTotal(Integer deploymentsTotal) {
            return deploymentsTotal(Output.of(deploymentsTotal));
        }

        /**
         * @param description A description for the StackScript.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
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
         * @param images An array of Image IDs representing the Images that this StackScript is compatible for deploying with. `any/all` indicates that all available image distributions, including private images, are accepted. Currently private image IDs are not supported.
         * 
         * @return builder
         * 
         */
        public Builder images(@Nullable Output<List<String>> images) {
            $.images = images;
            return this;
        }

        /**
         * @param images An array of Image IDs representing the Images that this StackScript is compatible for deploying with. `any/all` indicates that all available image distributions, including private images, are accepted. Currently private image IDs are not supported.
         * 
         * @return builder
         * 
         */
        public Builder images(List<String> images) {
            return images(Output.of(images));
        }

        /**
         * @param images An array of Image IDs representing the Images that this StackScript is compatible for deploying with. `any/all` indicates that all available image distributions, including private images, are accepted. Currently private image IDs are not supported.
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
        public Builder label(@Nullable Output<String> label) {
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
        public Builder script(@Nullable Output<String> script) {
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
         * @param updated The date this StackScript was updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(@Nullable Output<String> updated) {
            $.updated = updated;
            return this;
        }

        /**
         * @param updated The date this StackScript was updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(String updated) {
            return updated(Output.of(updated));
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

        /**
         * @param userGravatarId The Gravatar ID for the User who created the StackScript.
         * 
         * @return builder
         * 
         */
        public Builder userGravatarId(@Nullable Output<String> userGravatarId) {
            $.userGravatarId = userGravatarId;
            return this;
        }

        /**
         * @param userGravatarId The Gravatar ID for the User who created the StackScript.
         * 
         * @return builder
         * 
         */
        public Builder userGravatarId(String userGravatarId) {
            return userGravatarId(Output.of(userGravatarId));
        }

        /**
         * @param username The User who created the StackScript.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The User who created the StackScript.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public StackScriptState build() {
            return $;
        }
    }

}
