// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallsFirewallDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFirewallsFirewallDeviceArgs Empty = new GetFirewallsFirewallDeviceArgs();

    @Import(name="entityId", required=true)
    private Output<Integer> entityId;

    public Output<Integer> entityId() {
        return this.entityId;
    }

    /**
     * The unique ID assigned to this Firewall.
     * 
     */
    @Import(name="id", required=true)
    private Output<Integer> id;

    /**
     * @return The unique ID assigned to this Firewall.
     * 
     */
    public Output<Integer> id() {
        return this.id;
    }

    /**
     * The label for the Firewall. For display purposes only. If no label is provided, a default will be assigned.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The label for the Firewall. For display purposes only. If no label is provided, a default will be assigned.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    @Import(name="url", required=true)
    private Output<String> url;

    public Output<String> url() {
        return this.url;
    }

    private GetFirewallsFirewallDeviceArgs() {}

    private GetFirewallsFirewallDeviceArgs(GetFirewallsFirewallDeviceArgs $) {
        this.entityId = $.entityId;
        this.id = $.id;
        this.label = $.label;
        this.type = $.type;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallsFirewallDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallsFirewallDeviceArgs $;

        public Builder() {
            $ = new GetFirewallsFirewallDeviceArgs();
        }

        public Builder(GetFirewallsFirewallDeviceArgs defaults) {
            $ = new GetFirewallsFirewallDeviceArgs(Objects.requireNonNull(defaults));
        }

        public Builder entityId(Output<Integer> entityId) {
            $.entityId = entityId;
            return this;
        }

        public Builder entityId(Integer entityId) {
            return entityId(Output.of(entityId));
        }

        /**
         * @param id The unique ID assigned to this Firewall.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique ID assigned to this Firewall.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param label The label for the Firewall. For display purposes only. If no label is provided, a default will be assigned.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label for the Firewall. For display purposes only. If no label is provided, a default will be assigned.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public GetFirewallsFirewallDeviceArgs build() {
            if ($.entityId == null) {
                throw new MissingRequiredPropertyException("GetFirewallsFirewallDeviceArgs", "entityId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetFirewallsFirewallDeviceArgs", "id");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetFirewallsFirewallDeviceArgs", "label");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetFirewallsFirewallDeviceArgs", "type");
            }
            if ($.url == null) {
                throw new MissingRequiredPropertyException("GetFirewallsFirewallDeviceArgs", "url");
            }
            return $;
        }
    }

}
