// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallsFirewallDevice extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallsFirewallDevice Empty = new GetFirewallsFirewallDevice();

    @Import(name="entityId", required=true)
    private Integer entityId;

    public Integer entityId() {
        return this.entityId;
    }

    /**
     * The unique ID assigned to this Firewall.
     * 
     */
    @Import(name="id", required=true)
    private Integer id;

    /**
     * @return The unique ID assigned to this Firewall.
     * 
     */
    public Integer id() {
        return this.id;
    }

    /**
     * The label for the Firewall. For display purposes only. If no label is provided, a default will be assigned.
     * 
     */
    @Import(name="label", required=true)
    private String label;

    /**
     * @return The label for the Firewall. For display purposes only. If no label is provided, a default will be assigned.
     * 
     */
    public String label() {
        return this.label;
    }

    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    @Import(name="url", required=true)
    private String url;

    public String url() {
        return this.url;
    }

    private GetFirewallsFirewallDevice() {}

    private GetFirewallsFirewallDevice(GetFirewallsFirewallDevice $) {
        this.entityId = $.entityId;
        this.id = $.id;
        this.label = $.label;
        this.type = $.type;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallsFirewallDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallsFirewallDevice $;

        public Builder() {
            $ = new GetFirewallsFirewallDevice();
        }

        public Builder(GetFirewallsFirewallDevice defaults) {
            $ = new GetFirewallsFirewallDevice(Objects.requireNonNull(defaults));
        }

        public Builder entityId(Integer entityId) {
            $.entityId = entityId;
            return this;
        }

        /**
         * @param id The unique ID assigned to this Firewall.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            $.id = id;
            return this;
        }

        /**
         * @param label The label for the Firewall. For display purposes only. If no label is provided, a default will be assigned.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            $.label = label;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder url(String url) {
            $.url = url;
            return this;
        }

        public GetFirewallsFirewallDevice build() {
            if ($.entityId == null) {
                throw new MissingRequiredPropertyException("GetFirewallsFirewallDevice", "entityId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetFirewallsFirewallDevice", "id");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetFirewallsFirewallDevice", "label");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetFirewallsFirewallDevice", "type");
            }
            if ($.url == null) {
                throw new MissingRequiredPropertyException("GetFirewallsFirewallDevice", "url");
            }
            return $;
        }
    }

}
