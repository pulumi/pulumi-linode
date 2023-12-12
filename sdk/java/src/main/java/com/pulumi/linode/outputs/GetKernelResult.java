// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKernelResult {
    /**
     * @return The architecture of this Kernel.
     * 
     */
    private String architecture;
    private String built;
    /**
     * @return Whether or not this Kernel is deprecated.
     * 
     */
    private Boolean deprecated;
    private String id;
    /**
     * @return If this Kernel is suitable for KVM Linodes.
     * 
     */
    private Boolean kvm;
    /**
     * @return The friendly name of this Kernel.
     * 
     */
    private String label;
    /**
     * @return If this Kernel is suitable for paravirtualized operations.
     * 
     */
    private Boolean pvops;
    /**
     * @return Linux Kernel version
     * 
     */
    private String version;
    /**
     * @return If this Kernel is suitable for Xen Linodes.
     * 
     */
    private Boolean xen;

    private GetKernelResult() {}
    /**
     * @return The architecture of this Kernel.
     * 
     */
    public String architecture() {
        return this.architecture;
    }
    public String built() {
        return this.built;
    }
    /**
     * @return Whether or not this Kernel is deprecated.
     * 
     */
    public Boolean deprecated() {
        return this.deprecated;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return If this Kernel is suitable for KVM Linodes.
     * 
     */
    public Boolean kvm() {
        return this.kvm;
    }
    /**
     * @return The friendly name of this Kernel.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return If this Kernel is suitable for paravirtualized operations.
     * 
     */
    public Boolean pvops() {
        return this.pvops;
    }
    /**
     * @return Linux Kernel version
     * 
     */
    public String version() {
        return this.version;
    }
    /**
     * @return If this Kernel is suitable for Xen Linodes.
     * 
     */
    public Boolean xen() {
        return this.xen;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKernelResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String architecture;
        private String built;
        private Boolean deprecated;
        private String id;
        private Boolean kvm;
        private String label;
        private Boolean pvops;
        private String version;
        private Boolean xen;
        public Builder() {}
        public Builder(GetKernelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.built = defaults.built;
    	      this.deprecated = defaults.deprecated;
    	      this.id = defaults.id;
    	      this.kvm = defaults.kvm;
    	      this.label = defaults.label;
    	      this.pvops = defaults.pvops;
    	      this.version = defaults.version;
    	      this.xen = defaults.xen;
        }

        @CustomType.Setter
        public Builder architecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }
        @CustomType.Setter
        public Builder built(String built) {
            this.built = Objects.requireNonNull(built);
            return this;
        }
        @CustomType.Setter
        public Builder deprecated(Boolean deprecated) {
            this.deprecated = Objects.requireNonNull(deprecated);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kvm(Boolean kvm) {
            this.kvm = Objects.requireNonNull(kvm);
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder pvops(Boolean pvops) {
            this.pvops = Objects.requireNonNull(pvops);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        @CustomType.Setter
        public Builder xen(Boolean xen) {
            this.xen = Objects.requireNonNull(xen);
            return this;
        }
        public GetKernelResult build() {
            final var _resultValue = new GetKernelResult();
            _resultValue.architecture = architecture;
            _resultValue.built = built;
            _resultValue.deprecated = deprecated;
            _resultValue.id = id;
            _resultValue.kvm = kvm;
            _resultValue.label = label;
            _resultValue.pvops = pvops;
            _resultValue.version = version;
            _resultValue.xen = xen;
            return _resultValue;
        }
    }
}
