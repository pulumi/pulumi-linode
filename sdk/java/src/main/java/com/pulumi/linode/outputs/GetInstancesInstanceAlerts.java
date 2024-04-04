// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetInstancesInstanceAlerts {
    /**
     * @return The percentage of CPU usage required to trigger an alert. If the average CPU usage over two hours exceeds this value, we&#39;ll send you an alert. If this is set to 0, the alert is disabled.
     * 
     */
    private Integer cpu;
    /**
     * @return The amount of disk IO operation per second required to trigger an alert. If the average disk IO over two hours exceeds this value, we&#39;ll send you an alert. If set to 0, this alert is disabled.
     * 
     */
    private Integer io;
    /**
     * @return The amount of incoming traffic, in Mbit/s, required to trigger an alert. If the average incoming traffic over two hours exceeds this value, we&#39;ll send you an alert. If this is set to 0 (zero), the alert is disabled.
     * 
     */
    private Integer networkIn;
    /**
     * @return The amount of outbound traffic, in Mbit/s, required to trigger an alert. If the average outbound traffic over two hours exceeds this value, we&#39;ll send you an alert. If this is set to 0 (zero), the alert is disabled.
     * 
     */
    private Integer networkOut;
    /**
     * @return The percentage of network transfer that may be used before an alert is triggered. When this value is exceeded, we&#39;ll alert you. If this is set to 0 (zero), the alert is disabled.
     * 
     */
    private Integer transferQuota;

    private GetInstancesInstanceAlerts() {}
    /**
     * @return The percentage of CPU usage required to trigger an alert. If the average CPU usage over two hours exceeds this value, we&#39;ll send you an alert. If this is set to 0, the alert is disabled.
     * 
     */
    public Integer cpu() {
        return this.cpu;
    }
    /**
     * @return The amount of disk IO operation per second required to trigger an alert. If the average disk IO over two hours exceeds this value, we&#39;ll send you an alert. If set to 0, this alert is disabled.
     * 
     */
    public Integer io() {
        return this.io;
    }
    /**
     * @return The amount of incoming traffic, in Mbit/s, required to trigger an alert. If the average incoming traffic over two hours exceeds this value, we&#39;ll send you an alert. If this is set to 0 (zero), the alert is disabled.
     * 
     */
    public Integer networkIn() {
        return this.networkIn;
    }
    /**
     * @return The amount of outbound traffic, in Mbit/s, required to trigger an alert. If the average outbound traffic over two hours exceeds this value, we&#39;ll send you an alert. If this is set to 0 (zero), the alert is disabled.
     * 
     */
    public Integer networkOut() {
        return this.networkOut;
    }
    /**
     * @return The percentage of network transfer that may be used before an alert is triggered. When this value is exceeded, we&#39;ll alert you. If this is set to 0 (zero), the alert is disabled.
     * 
     */
    public Integer transferQuota() {
        return this.transferQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstanceAlerts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer cpu;
        private Integer io;
        private Integer networkIn;
        private Integer networkOut;
        private Integer transferQuota;
        public Builder() {}
        public Builder(GetInstancesInstanceAlerts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.io = defaults.io;
    	      this.networkIn = defaults.networkIn;
    	      this.networkOut = defaults.networkOut;
    	      this.transferQuota = defaults.transferQuota;
        }

        @CustomType.Setter
        public Builder cpu(Integer cpu) {
            if (cpu == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstanceAlerts", "cpu");
            }
            this.cpu = cpu;
            return this;
        }
        @CustomType.Setter
        public Builder io(Integer io) {
            if (io == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstanceAlerts", "io");
            }
            this.io = io;
            return this;
        }
        @CustomType.Setter
        public Builder networkIn(Integer networkIn) {
            if (networkIn == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstanceAlerts", "networkIn");
            }
            this.networkIn = networkIn;
            return this;
        }
        @CustomType.Setter
        public Builder networkOut(Integer networkOut) {
            if (networkOut == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstanceAlerts", "networkOut");
            }
            this.networkOut = networkOut;
            return this;
        }
        @CustomType.Setter
        public Builder transferQuota(Integer transferQuota) {
            if (transferQuota == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstanceAlerts", "transferQuota");
            }
            this.transferQuota = transferQuota;
            return this;
        }
        public GetInstancesInstanceAlerts build() {
            final var _resultValue = new GetInstancesInstanceAlerts();
            _resultValue.cpu = cpu;
            _resultValue.io = io;
            _resultValue.networkIn = networkIn;
            _resultValue.networkOut = networkOut;
            _resultValue.transferQuota = transferQuota;
            return _resultValue;
        }
    }
}
