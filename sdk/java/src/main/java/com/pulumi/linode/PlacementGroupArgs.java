// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PlacementGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final PlacementGroupArgs Empty = new PlacementGroupArgs();

    /**
     * The affinity policy to use when placing Linodes in this group.
     * 
     */
    @Import(name="affinityType", required=true)
    private Output<String> affinityType;

    /**
     * @return The affinity policy to use when placing Linodes in this group.
     * 
     */
    public Output<String> affinityType() {
        return this.affinityType;
    }

    /**
     * Whether Linodes must be able to become compliant during assignment. (Default `true`)
     * 
     */
    @Import(name="isStrict")
    private @Nullable Output<Boolean> isStrict;

    /**
     * @return Whether Linodes must be able to become compliant during assignment. (Default `true`)
     * 
     */
    public Optional<Output<Boolean>> isStrict() {
        return Optional.ofNullable(this.isStrict);
    }

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
        this.affinityType = $.affinityType;
        this.isStrict = $.isStrict;
        this.label = $.label;
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
         * @param affinityType The affinity policy to use when placing Linodes in this group.
         * 
         * @return builder
         * 
         */
        public Builder affinityType(Output<String> affinityType) {
            $.affinityType = affinityType;
            return this;
        }

        /**
         * @param affinityType The affinity policy to use when placing Linodes in this group.
         * 
         * @return builder
         * 
         */
        public Builder affinityType(String affinityType) {
            return affinityType(Output.of(affinityType));
        }

        /**
         * @param isStrict Whether Linodes must be able to become compliant during assignment. (Default `true`)
         * 
         * @return builder
         * 
         */
        public Builder isStrict(@Nullable Output<Boolean> isStrict) {
            $.isStrict = isStrict;
            return this;
        }

        /**
         * @param isStrict Whether Linodes must be able to become compliant during assignment. (Default `true`)
         * 
         * @return builder
         * 
         */
        public Builder isStrict(Boolean isStrict) {
            return isStrict(Output.of(isStrict));
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
            if ($.affinityType == null) {
                throw new MissingRequiredPropertyException("PlacementGroupArgs", "affinityType");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("PlacementGroupArgs", "label");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("PlacementGroupArgs", "region");
            }
            return $;
        }
    }

}
