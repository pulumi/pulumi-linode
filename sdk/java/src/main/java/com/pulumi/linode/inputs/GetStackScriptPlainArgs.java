// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetStackScriptUserDefinedField;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStackScriptPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStackScriptPlainArgs Empty = new GetStackScriptPlainArgs();

    /**
     * The unique numeric ID of the StackScript to query.
     * 
     */
    @Import(name="id", required=true)
    private Integer id;

    /**
     * @return The unique numeric ID of the StackScript to query.
     * 
     */
    public Integer id() {
        return this.id;
    }

    /**
     * This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
     * 
     */
    @Import(name="userDefinedFields")
    private @Nullable List<GetStackScriptUserDefinedField> userDefinedFields;

    /**
     * @return This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
     * 
     */
    public Optional<List<GetStackScriptUserDefinedField>> userDefinedFields() {
        return Optional.ofNullable(this.userDefinedFields);
    }

    private GetStackScriptPlainArgs() {}

    private GetStackScriptPlainArgs(GetStackScriptPlainArgs $) {
        this.id = $.id;
        this.userDefinedFields = $.userDefinedFields;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStackScriptPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStackScriptPlainArgs $;

        public Builder() {
            $ = new GetStackScriptPlainArgs();
        }

        public Builder(GetStackScriptPlainArgs defaults) {
            $ = new GetStackScriptPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique numeric ID of the StackScript to query.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            $.id = id;
            return this;
        }

        /**
         * @param userDefinedFields This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedFields(@Nullable List<GetStackScriptUserDefinedField> userDefinedFields) {
            $.userDefinedFields = userDefinedFields;
            return this;
        }

        /**
         * @param userDefinedFields This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
         * 
         * @return builder
         * 
         */
        public Builder userDefinedFields(GetStackScriptUserDefinedField... userDefinedFields) {
            return userDefinedFields(List.of(userDefinedFields));
        }

        public GetStackScriptPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
