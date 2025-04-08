# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = ['NodeBalancerNodeArgs', 'NodeBalancerNode']

@pulumi.input_type
class NodeBalancerNodeArgs:
    def __init__(__self__, *,
                 address: pulumi.Input[builtins.str],
                 config_id: pulumi.Input[builtins.int],
                 label: pulumi.Input[builtins.str],
                 nodebalancer_id: pulumi.Input[builtins.int],
                 mode: Optional[pulumi.Input[builtins.str]] = None,
                 weight: Optional[pulumi.Input[builtins.int]] = None):
        """
        The set of arguments for constructing a NodeBalancerNode resource.
        :param pulumi.Input[builtins.str] address: The private IP Address where this backend can be reached. This must be a private IP address.
               
               - - -
        :param pulumi.Input[builtins.int] config_id: The ID of the NodeBalancerConfig to access.
        :param pulumi.Input[builtins.str] label: The label of the Linode NodeBalancer Node. This is for display purposes only.
        :param pulumi.Input[builtins.int] nodebalancer_id: The ID of the NodeBalancer to access.
        :param pulumi.Input[builtins.str] mode: The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
        :param pulumi.Input[builtins.int] weight: Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
        """
        pulumi.set(__self__, "address", address)
        pulumi.set(__self__, "config_id", config_id)
        pulumi.set(__self__, "label", label)
        pulumi.set(__self__, "nodebalancer_id", nodebalancer_id)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Input[builtins.str]:
        """
        The private IP Address where this backend can be reached. This must be a private IP address.

        - - -
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Input[builtins.int]:
        """
        The ID of the NodeBalancerConfig to access.
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter
    def label(self) -> pulumi.Input[builtins.str]:
        """
        The label of the Linode NodeBalancer Node. This is for display purposes only.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="nodebalancerId")
    def nodebalancer_id(self) -> pulumi.Input[builtins.int]:
        """
        The ID of the NodeBalancer to access.
        """
        return pulumi.get(self, "nodebalancer_id")

    @nodebalancer_id.setter
    def nodebalancer_id(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "nodebalancer_id", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "weight", value)


@pulumi.input_type
class _NodeBalancerNodeState:
    def __init__(__self__, *,
                 address: Optional[pulumi.Input[builtins.str]] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 label: Optional[pulumi.Input[builtins.str]] = None,
                 mode: Optional[pulumi.Input[builtins.str]] = None,
                 nodebalancer_id: Optional[pulumi.Input[builtins.int]] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None,
                 weight: Optional[pulumi.Input[builtins.int]] = None):
        """
        Input properties used for looking up and filtering NodeBalancerNode resources.
        :param pulumi.Input[builtins.str] address: The private IP Address where this backend can be reached. This must be a private IP address.
               
               - - -
        :param pulumi.Input[builtins.int] config_id: The ID of the NodeBalancerConfig to access.
        :param pulumi.Input[builtins.str] label: The label of the Linode NodeBalancer Node. This is for display purposes only.
        :param pulumi.Input[builtins.str] mode: The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
        :param pulumi.Input[builtins.int] nodebalancer_id: The ID of the NodeBalancer to access.
        :param pulumi.Input[builtins.str] status: The current status of this node, based on the configured checks of its NodeBalancer Config. (`unknown`, `UP`, `DOWN`).
        :param pulumi.Input[builtins.int] weight: Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
        """
        if address is not None:
            pulumi.set(__self__, "address", address)
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if nodebalancer_id is not None:
            pulumi.set(__self__, "nodebalancer_id", nodebalancer_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The private IP Address where this backend can be reached. This must be a private IP address.

        - - -
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The ID of the NodeBalancerConfig to access.
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The label of the Linode NodeBalancer Node. This is for display purposes only.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter(name="nodebalancerId")
    def nodebalancer_id(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The ID of the NodeBalancer to access.
        """
        return pulumi.get(self, "nodebalancer_id")

    @nodebalancer_id.setter
    def nodebalancer_id(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "nodebalancer_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The current status of this node, based on the configured checks of its NodeBalancer Config. (`unknown`, `UP`, `DOWN`).
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "weight", value)


class NodeBalancerNode(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[builtins.str]] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 label: Optional[pulumi.Input[builtins.str]] = None,
                 mode: Optional[pulumi.Input[builtins.str]] = None,
                 nodebalancer_id: Optional[pulumi.Input[builtins.int]] = None,
                 weight: Optional[pulumi.Input[builtins.int]] = None,
                 __props__=None):
        """
        Provides a Linode NodeBalancer Node resource.  This can be used to create, modify, and delete Linodes NodeBalancer Nodes.
        For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-node-balancer-node).

        ## Import

        NodeBalancer Nodes can be imported using the NodeBalancer `nodebalancer_id` followed by the NodeBalancer Config `config_id` followed by the NodeBalancer Node `id`, separated by a comma, e.g.

        ```sh
        $ pulumi import linode:index/nodeBalancerNode:NodeBalancerNode https-foobar-1 1234567,7654321,9999999
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] address: The private IP Address where this backend can be reached. This must be a private IP address.
               
               - - -
        :param pulumi.Input[builtins.int] config_id: The ID of the NodeBalancerConfig to access.
        :param pulumi.Input[builtins.str] label: The label of the Linode NodeBalancer Node. This is for display purposes only.
        :param pulumi.Input[builtins.str] mode: The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
        :param pulumi.Input[builtins.int] nodebalancer_id: The ID of the NodeBalancer to access.
        :param pulumi.Input[builtins.int] weight: Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NodeBalancerNodeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Linode NodeBalancer Node resource.  This can be used to create, modify, and delete Linodes NodeBalancer Nodes.
        For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-node-balancer-node).

        ## Import

        NodeBalancer Nodes can be imported using the NodeBalancer `nodebalancer_id` followed by the NodeBalancer Config `config_id` followed by the NodeBalancer Node `id`, separated by a comma, e.g.

        ```sh
        $ pulumi import linode:index/nodeBalancerNode:NodeBalancerNode https-foobar-1 1234567,7654321,9999999
        ```

        :param str resource_name: The name of the resource.
        :param NodeBalancerNodeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NodeBalancerNodeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[builtins.str]] = None,
                 config_id: Optional[pulumi.Input[builtins.int]] = None,
                 label: Optional[pulumi.Input[builtins.str]] = None,
                 mode: Optional[pulumi.Input[builtins.str]] = None,
                 nodebalancer_id: Optional[pulumi.Input[builtins.int]] = None,
                 weight: Optional[pulumi.Input[builtins.int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NodeBalancerNodeArgs.__new__(NodeBalancerNodeArgs)

            if address is None and not opts.urn:
                raise TypeError("Missing required property 'address'")
            __props__.__dict__["address"] = address
            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__.__dict__["config_id"] = config_id
            if label is None and not opts.urn:
                raise TypeError("Missing required property 'label'")
            __props__.__dict__["label"] = label
            __props__.__dict__["mode"] = mode
            if nodebalancer_id is None and not opts.urn:
                raise TypeError("Missing required property 'nodebalancer_id'")
            __props__.__dict__["nodebalancer_id"] = nodebalancer_id
            __props__.__dict__["weight"] = weight
            __props__.__dict__["status"] = None
        super(NodeBalancerNode, __self__).__init__(
            'linode:index/nodeBalancerNode:NodeBalancerNode',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            address: Optional[pulumi.Input[builtins.str]] = None,
            config_id: Optional[pulumi.Input[builtins.int]] = None,
            label: Optional[pulumi.Input[builtins.str]] = None,
            mode: Optional[pulumi.Input[builtins.str]] = None,
            nodebalancer_id: Optional[pulumi.Input[builtins.int]] = None,
            status: Optional[pulumi.Input[builtins.str]] = None,
            weight: Optional[pulumi.Input[builtins.int]] = None) -> 'NodeBalancerNode':
        """
        Get an existing NodeBalancerNode resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] address: The private IP Address where this backend can be reached. This must be a private IP address.
               
               - - -
        :param pulumi.Input[builtins.int] config_id: The ID of the NodeBalancerConfig to access.
        :param pulumi.Input[builtins.str] label: The label of the Linode NodeBalancer Node. This is for display purposes only.
        :param pulumi.Input[builtins.str] mode: The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
        :param pulumi.Input[builtins.int] nodebalancer_id: The ID of the NodeBalancer to access.
        :param pulumi.Input[builtins.str] status: The current status of this node, based on the configured checks of its NodeBalancer Config. (`unknown`, `UP`, `DOWN`).
        :param pulumi.Input[builtins.int] weight: Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NodeBalancerNodeState.__new__(_NodeBalancerNodeState)

        __props__.__dict__["address"] = address
        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["label"] = label
        __props__.__dict__["mode"] = mode
        __props__.__dict__["nodebalancer_id"] = nodebalancer_id
        __props__.__dict__["status"] = status
        __props__.__dict__["weight"] = weight
        return NodeBalancerNode(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Output[builtins.str]:
        """
        The private IP Address where this backend can be reached. This must be a private IP address.

        - - -
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[builtins.int]:
        """
        The ID of the NodeBalancerConfig to access.
        """
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[builtins.str]:
        """
        The label of the Linode NodeBalancer Node. This is for display purposes only.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Output[builtins.str]:
        """
        The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter(name="nodebalancerId")
    def nodebalancer_id(self) -> pulumi.Output[builtins.int]:
        """
        The ID of the NodeBalancer to access.
        """
        return pulumi.get(self, "nodebalancer_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[builtins.str]:
        """
        The current status of this node, based on the configured checks of its NodeBalancer Config. (`unknown`, `UP`, `DOWN`).
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Output[builtins.int]:
        """
        Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
        """
        return pulumi.get(self, "weight")

