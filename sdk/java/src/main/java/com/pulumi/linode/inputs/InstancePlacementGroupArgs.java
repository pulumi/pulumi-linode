// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstancePlacementGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstancePlacementGroupArgs Empty = new InstancePlacementGroupArgs();

    /**
     * The affinity policy enforced by the Placement Group.
     * 
     */
    @Import(name="affinityType")
    private @Nullable Output<String> affinityType;

    /**
     * @return The affinity policy enforced by the Placement Group.
     * 
     */
    public Optional<Output<String>> affinityType() {
        return Optional.ofNullable(this.affinityType);
    }

    @Import(name="compliantOnly")
    private @Nullable Output<Boolean> compliantOnly;

    public Optional<Output<Boolean>> compliantOnly() {
        return Optional.ofNullable(this.compliantOnly);
    }

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
     * Whether the Placement Group enforces strict compliance.
     * 
     */
    @Import(name="isStrict")
    private @Nullable Output<Boolean> isStrict;

    /**
     * @return Whether the Placement Group enforces strict compliance.
     * 
     */
    public Optional<Output<Boolean>> isStrict() {
        return Optional.ofNullable(this.isStrict);
    }

    /**
     * The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    private InstancePlacementGroupArgs() {}

    private InstancePlacementGroupArgs(InstancePlacementGroupArgs $) {
        this.affinityType = $.affinityType;
        this.compliantOnly = $.compliantOnly;
        this.id = $.id;
        this.isStrict = $.isStrict;
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePlacementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePlacementGroupArgs $;

        public Builder() {
            $ = new InstancePlacementGroupArgs();
        }

        public Builder(InstancePlacementGroupArgs defaults) {
            $ = new InstancePlacementGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param affinityType The affinity policy enforced by the Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder affinityType(@Nullable Output<String> affinityType) {
            $.affinityType = affinityType;
            return this;
        }

        /**
         * @param affinityType The affinity policy enforced by the Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder affinityType(String affinityType) {
            return affinityType(Output.of(affinityType));
        }

        public Builder compliantOnly(@Nullable Output<Boolean> compliantOnly) {
            $.compliantOnly = compliantOnly;
            return this;
        }

        public Builder compliantOnly(Boolean compliantOnly) {
            return compliantOnly(Output.of(compliantOnly));
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
         * @param isStrict Whether the Placement Group enforces strict compliance.
         * 
         * @return builder
         * 
         */
        public Builder isStrict(@Nullable Output<Boolean> isStrict) {
            $.isStrict = isStrict;
            return this;
        }

        /**
         * @param isStrict Whether the Placement Group enforces strict compliance.
         * 
         * @return builder
         * 
         */
        public Builder isStrict(Boolean isStrict) {
            return isStrict(Output.of(isStrict));
        }

        /**
         * @param label The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        public InstancePlacementGroupArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("InstancePlacementGroupArgs", "id");
            }
            return $;
        }
    }

}
