// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PlacementGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final PlacementGroupArgs Empty = new PlacementGroupArgs();

    /**
     * The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * Whether Linodes must be able to become compliant during assignment. (Default `strict`)
     * 
     */
    @Import(name="placementGroupPolicy")
    private @Nullable Output<String> placementGroupPolicy;

    /**
     * @return Whether Linodes must be able to become compliant during assignment. (Default `strict`)
     * 
     */
    public Optional<Output<String>> placementGroupPolicy() {
        return Optional.ofNullable(this.placementGroupPolicy);
    }

    /**
     * The placement group type to use when placing Linodes in this group.
     * 
     */
    @Import(name="placementGroupType", required=true)
    private Output<String> placementGroupType;

    /**
     * @return The placement group type to use when placing Linodes in this group.
     * 
     */
    public Output<String> placementGroupType() {
        return this.placementGroupType;
    }

    /**
     * The region of the Placement Group.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The region of the Placement Group.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private PlacementGroupArgs() {}

    private PlacementGroupArgs(PlacementGroupArgs $) {
        this.label = $.label;
        this.placementGroupPolicy = $.placementGroupPolicy;
        this.placementGroupType = $.placementGroupType;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PlacementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PlacementGroupArgs $;

        public Builder() {
            $ = new PlacementGroupArgs();
        }

        public Builder(PlacementGroupArgs defaults) {
            $ = new PlacementGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param label The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param placementGroupPolicy Whether Linodes must be able to become compliant during assignment. (Default `strict`)
         * 
         * @return builder
         * 
         */
        public Builder placementGroupPolicy(@Nullable Output<String> placementGroupPolicy) {
            $.placementGroupPolicy = placementGroupPolicy;
            return this;
        }

        /**
         * @param placementGroupPolicy Whether Linodes must be able to become compliant during assignment. (Default `strict`)
         * 
         * @return builder
         * 
         */
        public Builder placementGroupPolicy(String placementGroupPolicy) {
            return placementGroupPolicy(Output.of(placementGroupPolicy));
        }

        /**
         * @param placementGroupType The placement group type to use when placing Linodes in this group.
         * 
         * @return builder
         * 
         */
        public Builder placementGroupType(Output<String> placementGroupType) {
            $.placementGroupType = placementGroupType;
            return this;
        }

        /**
         * @param placementGroupType The placement group type to use when placing Linodes in this group.
         * 
         * @return builder
         * 
         */
        public Builder placementGroupType(String placementGroupType) {
            return placementGroupType(Output.of(placementGroupType));
        }

        /**
         * @param region The region of the Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region of the Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public PlacementGroupArgs build() {
            if ($.label == null) {
                throw new MissingRequiredPropertyException("PlacementGroupArgs", "label");
            }
            if ($.placementGroupType == null) {
                throw new MissingRequiredPropertyException("PlacementGroupArgs", "placementGroupType");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("PlacementGroupArgs", "region");
            }
            return $;
        }
    }

}
