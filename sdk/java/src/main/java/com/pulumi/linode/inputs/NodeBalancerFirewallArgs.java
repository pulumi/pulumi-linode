// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.NodeBalancerFirewallInboundArgs;
import com.pulumi.linode.inputs.NodeBalancerFirewallOutboundArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class NodeBalancerFirewallArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeBalancerFirewallArgs Empty = new NodeBalancerFirewallArgs();

    /**
     * When this firewall was created.
     * 
     */
    @Import(name="created", required=true)
    private Output<String> created;

    /**
     * @return When this firewall was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }

    /**
     * (Required) The Firewall&#39;s ID.
     * 
     */
    @Import(name="id", required=true)
    private Output<Integer> id;

    /**
     * @return (Required) The Firewall&#39;s ID.
     * 
     */
    public Output<Integer> id() {
        return this.id;
    }

    /**
     * The default behavior for inbound traffic. (`ACCEPT`, `DROP`)
     * 
     */
    @Import(name="inboundPolicy", required=true)
    private Output<String> inboundPolicy;

    /**
     * @return The default behavior for inbound traffic. (`ACCEPT`, `DROP`)
     * 
     */
    public Output<String> inboundPolicy() {
        return this.inboundPolicy;
    }

    @Import(name="inbounds", required=true)
    private Output<List<NodeBalancerFirewallInboundArgs>> inbounds;

    public Output<List<NodeBalancerFirewallInboundArgs>> inbounds() {
        return this.inbounds;
    }

    /**
     * The label of the Linode NodeBalancer
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The label of the Linode NodeBalancer
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * The default behavior for outbound traffic. (`ACCEPT`, `DROP`)
     * 
     */
    @Import(name="outboundPolicy", required=true)
    private Output<String> outboundPolicy;

    /**
     * @return The default behavior for outbound traffic. (`ACCEPT`, `DROP`)
     * 
     */
    public Output<String> outboundPolicy() {
        return this.outboundPolicy;
    }

    @Import(name="outbounds", required=true)
    private Output<List<NodeBalancerFirewallOutboundArgs>> outbounds;

    public Output<List<NodeBalancerFirewallOutboundArgs>> outbounds() {
        return this.outbounds;
    }

    /**
     * The status of the firewall. (`enabled`, `disabled`, `deleted`)
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return The status of the firewall. (`enabled`, `disabled`, `deleted`)
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    @Import(name="tags", required=true)
    private Output<List<String>> tags;

    /**
     * @return A list of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    public Output<List<String>> tags() {
        return this.tags;
    }

    /**
     * When this firewall was last updated.
     * 
     */
    @Import(name="updated", required=true)
    private Output<String> updated;

    /**
     * @return When this firewall was last updated.
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }

    private NodeBalancerFirewallArgs() {}

    private NodeBalancerFirewallArgs(NodeBalancerFirewallArgs $) {
        this.created = $.created;
        this.id = $.id;
        this.inboundPolicy = $.inboundPolicy;
        this.inbounds = $.inbounds;
        this.label = $.label;
        this.outboundPolicy = $.outboundPolicy;
        this.outbounds = $.outbounds;
        this.status = $.status;
        this.tags = $.tags;
        this.updated = $.updated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeBalancerFirewallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeBalancerFirewallArgs $;

        public Builder() {
            $ = new NodeBalancerFirewallArgs();
        }

        public Builder(NodeBalancerFirewallArgs defaults) {
            $ = new NodeBalancerFirewallArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param created When this firewall was created.
         * 
         * @return builder
         * 
         */
        public Builder created(Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created When this firewall was created.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param id (Required) The Firewall&#39;s ID.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id (Required) The Firewall&#39;s ID.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param inboundPolicy The default behavior for inbound traffic. (`ACCEPT`, `DROP`)
         * 
         * @return builder
         * 
         */
        public Builder inboundPolicy(Output<String> inboundPolicy) {
            $.inboundPolicy = inboundPolicy;
            return this;
        }

        /**
         * @param inboundPolicy The default behavior for inbound traffic. (`ACCEPT`, `DROP`)
         * 
         * @return builder
         * 
         */
        public Builder inboundPolicy(String inboundPolicy) {
            return inboundPolicy(Output.of(inboundPolicy));
        }

        public Builder inbounds(Output<List<NodeBalancerFirewallInboundArgs>> inbounds) {
            $.inbounds = inbounds;
            return this;
        }

        public Builder inbounds(List<NodeBalancerFirewallInboundArgs> inbounds) {
            return inbounds(Output.of(inbounds));
        }

        public Builder inbounds(NodeBalancerFirewallInboundArgs... inbounds) {
            return inbounds(List.of(inbounds));
        }

        /**
         * @param label The label of the Linode NodeBalancer
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label of the Linode NodeBalancer
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param outboundPolicy The default behavior for outbound traffic. (`ACCEPT`, `DROP`)
         * 
         * @return builder
         * 
         */
        public Builder outboundPolicy(Output<String> outboundPolicy) {
            $.outboundPolicy = outboundPolicy;
            return this;
        }

        /**
         * @param outboundPolicy The default behavior for outbound traffic. (`ACCEPT`, `DROP`)
         * 
         * @return builder
         * 
         */
        public Builder outboundPolicy(String outboundPolicy) {
            return outboundPolicy(Output.of(outboundPolicy));
        }

        public Builder outbounds(Output<List<NodeBalancerFirewallOutboundArgs>> outbounds) {
            $.outbounds = outbounds;
            return this;
        }

        public Builder outbounds(List<NodeBalancerFirewallOutboundArgs> outbounds) {
            return outbounds(Output.of(outbounds));
        }

        public Builder outbounds(NodeBalancerFirewallOutboundArgs... outbounds) {
            return outbounds(List.of(outbounds));
        }

        /**
         * @param status The status of the firewall. (`enabled`, `disabled`, `deleted`)
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the firewall. (`enabled`, `disabled`, `deleted`)
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A list of tags applied to this object. Tags are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags applied to this object. Tags are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags applied to this object. Tags are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param updated When this firewall was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(Output<String> updated) {
            $.updated = updated;
            return this;
        }

        /**
         * @param updated When this firewall was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(String updated) {
            return updated(Output.of(updated));
        }

        public NodeBalancerFirewallArgs build() {
            if ($.created == null) {
                throw new MissingRequiredPropertyException("NodeBalancerFirewallArgs", "created");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("NodeBalancerFirewallArgs", "id");
            }
            if ($.inboundPolicy == null) {
                throw new MissingRequiredPropertyException("NodeBalancerFirewallArgs", "inboundPolicy");
            }
            if ($.inbounds == null) {
                throw new MissingRequiredPropertyException("NodeBalancerFirewallArgs", "inbounds");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("NodeBalancerFirewallArgs", "label");
            }
            if ($.outboundPolicy == null) {
                throw new MissingRequiredPropertyException("NodeBalancerFirewallArgs", "outboundPolicy");
            }
            if ($.outbounds == null) {
                throw new MissingRequiredPropertyException("NodeBalancerFirewallArgs", "outbounds");
            }
            if ($.status == null) {
                throw new MissingRequiredPropertyException("NodeBalancerFirewallArgs", "status");
            }
            if ($.tags == null) {
                throw new MissingRequiredPropertyException("NodeBalancerFirewallArgs", "tags");
            }
            if ($.updated == null) {
                throw new MissingRequiredPropertyException("NodeBalancerFirewallArgs", "updated");
            }
            return $;
        }
    }

}
