// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetPlacementGroupMemberArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPlacementGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPlacementGroupArgs Empty = new GetPlacementGroupArgs();

    /**
     * The ID of the Placement Group.
     * 
     */
    @Import(name="id", required=true)
    private Output<Integer> id;

    /**
     * @return The ID of the Placement Group.
     * 
     */
    public Output<Integer> id() {
        return this.id;
    }

    /**
     * A set of Linodes currently assigned to this Placement Group.
     * 
     */
    @Import(name="members")
    private @Nullable Output<List<GetPlacementGroupMemberArgs>> members;

    /**
     * @return A set of Linodes currently assigned to this Placement Group.
     * 
     */
    public Optional<Output<List<GetPlacementGroupMemberArgs>>> members() {
        return Optional.ofNullable(this.members);
    }

    private GetPlacementGroupArgs() {}

    private GetPlacementGroupArgs(GetPlacementGroupArgs $) {
        this.id = $.id;
        this.members = $.members;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPlacementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPlacementGroupArgs $;

        public Builder() {
            $ = new GetPlacementGroupArgs();
        }

        public Builder(GetPlacementGroupArgs defaults) {
            $ = new GetPlacementGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param members A set of Linodes currently assigned to this Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder members(@Nullable Output<List<GetPlacementGroupMemberArgs>> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members A set of Linodes currently assigned to this Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder members(List<GetPlacementGroupMemberArgs> members) {
            return members(Output.of(members));
        }

        /**
         * @param members A set of Linodes currently assigned to this Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder members(GetPlacementGroupMemberArgs... members) {
            return members(List.of(members));
        }

        public GetPlacementGroupArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupArgs", "id");
            }
            return $;
        }
    }

}
