// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetStackScriptsStackscriptUserDefinedField;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetStackScriptsStackscript {
    /**
     * @return The date this StackScript was created.
     * 
     */
    private String created;
    /**
     * @return Count of currently active, deployed Linodes created from this StackScript.
     * 
     */
    private Integer deploymentsActive;
    /**
     * @return The total number of times this StackScript has been deployed.
     * 
     */
    private Integer deploymentsTotal;
    /**
     * @return A description for the StackScript.
     * 
     */
    private String description;
    /**
     * @return The unique ID of the StackScript.
     * 
     */
    private String id;
    /**
     * @return An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
     * 
     */
    private List<String> images;
    /**
     * @return This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private.
     * 
     */
    private Boolean isPublic;
    /**
     * @return A human-readable label for the field that will serve as the input prompt for entering the value during deployment.
     * 
     */
    private String label;
    /**
     * @return This field allows you to add notes for the set of revisions made to this StackScript.
     * 
     */
    private String revNote;
    /**
     * @return The script to execute when provisioning a new Linode with this StackScript.
     * 
     */
    private String script;
    /**
     * @return The date this StackScript was updated.
     * 
     */
    private String updated;
    /**
     * @return This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
     * 
     */
    private List<GetStackScriptsStackscriptUserDefinedField> userDefinedFields;
    /**
     * @return The Gravatar ID for the User who created the StackScript.
     * 
     */
    private String userGravatarId;
    /**
     * @return The User who created the StackScript.
     * 
     */
    private String username;

    private GetStackScriptsStackscript() {}
    /**
     * @return The date this StackScript was created.
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return Count of currently active, deployed Linodes created from this StackScript.
     * 
     */
    public Integer deploymentsActive() {
        return this.deploymentsActive;
    }
    /**
     * @return The total number of times this StackScript has been deployed.
     * 
     */
    public Integer deploymentsTotal() {
        return this.deploymentsTotal;
    }
    /**
     * @return A description for the StackScript.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The unique ID of the StackScript.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
     * 
     */
    public List<String> images() {
        return this.images;
    }
    /**
     * @return This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private.
     * 
     */
    public Boolean isPublic() {
        return this.isPublic;
    }
    /**
     * @return A human-readable label for the field that will serve as the input prompt for entering the value during deployment.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return This field allows you to add notes for the set of revisions made to this StackScript.
     * 
     */
    public String revNote() {
        return this.revNote;
    }
    /**
     * @return The script to execute when provisioning a new Linode with this StackScript.
     * 
     */
    public String script() {
        return this.script;
    }
    /**
     * @return The date this StackScript was updated.
     * 
     */
    public String updated() {
        return this.updated;
    }
    /**
     * @return This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
     * 
     */
    public List<GetStackScriptsStackscriptUserDefinedField> userDefinedFields() {
        return this.userDefinedFields;
    }
    /**
     * @return The Gravatar ID for the User who created the StackScript.
     * 
     */
    public String userGravatarId() {
        return this.userGravatarId;
    }
    /**
     * @return The User who created the StackScript.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStackScriptsStackscript defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String created;
        private Integer deploymentsActive;
        private Integer deploymentsTotal;
        private String description;
        private String id;
        private List<String> images;
        private Boolean isPublic;
        private String label;
        private String revNote;
        private String script;
        private String updated;
        private List<GetStackScriptsStackscriptUserDefinedField> userDefinedFields;
        private String userGravatarId;
        private String username;
        public Builder() {}
        public Builder(GetStackScriptsStackscript defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.deploymentsActive = defaults.deploymentsActive;
    	      this.deploymentsTotal = defaults.deploymentsTotal;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.images = defaults.images;
    	      this.isPublic = defaults.isPublic;
    	      this.label = defaults.label;
    	      this.revNote = defaults.revNote;
    	      this.script = defaults.script;
    	      this.updated = defaults.updated;
    	      this.userDefinedFields = defaults.userDefinedFields;
    	      this.userGravatarId = defaults.userGravatarId;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        @CustomType.Setter
        public Builder deploymentsActive(Integer deploymentsActive) {
            this.deploymentsActive = Objects.requireNonNull(deploymentsActive);
            return this;
        }
        @CustomType.Setter
        public Builder deploymentsTotal(Integer deploymentsTotal) {
            this.deploymentsTotal = Objects.requireNonNull(deploymentsTotal);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder images(List<String> images) {
            this.images = Objects.requireNonNull(images);
            return this;
        }
        public Builder images(String... images) {
            return images(List.of(images));
        }
        @CustomType.Setter
        public Builder isPublic(Boolean isPublic) {
            this.isPublic = Objects.requireNonNull(isPublic);
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder revNote(String revNote) {
            this.revNote = Objects.requireNonNull(revNote);
            return this;
        }
        @CustomType.Setter
        public Builder script(String script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }
        @CustomType.Setter
        public Builder updated(String updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }
        @CustomType.Setter
        public Builder userDefinedFields(List<GetStackScriptsStackscriptUserDefinedField> userDefinedFields) {
            this.userDefinedFields = Objects.requireNonNull(userDefinedFields);
            return this;
        }
        public Builder userDefinedFields(GetStackScriptsStackscriptUserDefinedField... userDefinedFields) {
            return userDefinedFields(List.of(userDefinedFields));
        }
        @CustomType.Setter
        public Builder userGravatarId(String userGravatarId) {
            this.userGravatarId = Objects.requireNonNull(userGravatarId);
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public GetStackScriptsStackscript build() {
            final var _resultValue = new GetStackScriptsStackscript();
            _resultValue.created = created;
            _resultValue.deploymentsActive = deploymentsActive;
            _resultValue.deploymentsTotal = deploymentsTotal;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.images = images;
            _resultValue.isPublic = isPublic;
            _resultValue.label = label;
            _resultValue.revNote = revNote;
            _resultValue.script = script;
            _resultValue.updated = updated;
            _resultValue.userDefinedFields = userDefinedFields;
            _resultValue.userGravatarId = userGravatarId;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
