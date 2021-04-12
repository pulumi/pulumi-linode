# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables

__all__ = ['NodeBalancerNodeArgs', 'NodeBalancerNode']

@pulumi.input_type
class NodeBalancerNodeArgs:
    def __init__(__self__, *,
                 address: pulumi.Input[str],
                 config_id: pulumi.Input[int],
                 label: pulumi.Input[str],
                 nodebalancer_id: pulumi.Input[int],
                 mode: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a NodeBalancerNode resource.
        :param pulumi.Input[str] address: The private IP Address where this backend can be reached. This must be a private IP address.
        :param pulumi.Input[int] config_id: The ID of the NodeBalancerConfig to access.
        :param pulumi.Input[str] label: The label of the Linode NodeBalancer Node. This is for display purposes only.
        :param pulumi.Input[int] nodebalancer_id: The ID of the NodeBalancer to access.
        :param pulumi.Input[str] mode: The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it
        :param pulumi.Input[int] weight: Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
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
    def address(self) -> pulumi.Input[str]:
        """
        The private IP Address where this backend can be reached. This must be a private IP address.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: pulumi.Input[str]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Input[int]:
        """
        The ID of the NodeBalancerConfig to access.
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter
    def label(self) -> pulumi.Input[str]:
        """
        The label of the Linode NodeBalancer Node. This is for display purposes only.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: pulumi.Input[str]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="nodebalancerId")
    def nodebalancer_id(self) -> pulumi.Input[int]:
        """
        The ID of the NodeBalancer to access.
        """
        return pulumi.get(self, "nodebalancer_id")

    @nodebalancer_id.setter
    def nodebalancer_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "nodebalancer_id", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        """
        The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[int]]:
        """
        Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "weight", value)


class NodeBalancerNode(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[str]] = None,
                 config_id: Optional[pulumi.Input[int]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 nodebalancer_id: Optional[pulumi.Input[int]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Linode NodeBalancer Node resource.  This can be used to create, modify, and delete Linodes NodeBalancer Nodes.
        For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancerNode).

        ## Example Usage

        The following example shows how one might use this resource to configure NodeBalancer Nodes attached to Linode instances.

        ```python
        import pulumi
        import pulumi_linode as linode

        web = []
        for range in [{"value": i} for i in range(0, 3)]:
            web.append(linode.Instance(f"web-{range['value']}",
                authorized_keys=["ssh-rsa AAAA...Gw== user@example.local"],
                image="linode/ubuntu18.04",
                label=f"web-{range['value'] + 1}",
                private_ip=True,
                region="us-east",
                root_pass="test",
                type="g6-standard-1"))
        foobar = linode.NodeBalancer("foobar",
            client_conn_throttle=20,
            label="mynodebalancer",
            region="us-east")
        foofig = linode.NodeBalancerConfig("foofig",
            algorithm="source",
            check="http",
            check_attempts=3,
            check_path="/foo",
            check_timeout=30,
            nodebalancer_id=foobar.id,
            port=80,
            protocol="http",
            stickiness="http_cookie")
        foonode = []
        for range in [{"value": i} for i in range(0, 3)]:
            foonode.append(linode.NodeBalancerNode(f"foonode-{range['value']}",
                address=[__item.private_ip_address for __item in web][range["value"]].apply(lambda private_ip_addresses: f"{private_ip_addresses}:80"),
                config_id=foofig.id,
                label="mynodebalancernode",
                nodebalancer_id=foobar.id,
                weight=50))
        ```
        ## Attributes

        This resource exports the following attributes:

        * `status` - The current status of this node, based on the configured checks of its NodeBalancer Config. (unknown, UP, DOWN).

        * `config_id` - The ID of the NodeBalancerConfig this NodeBalancerNode is attached to.

        * `nodebalancer_id` - The ID of the NodeBalancer this NodeBalancerNode is attached to.

        ## Import

        NodeBalancer Nodes can be imported using the NodeBalancer `nodebalancer_id` followed by the NodeBalancer Config `config_id` followed by the NodeBalancer Node `id`, separated by a comma, e.g.

        ```sh
         $ pulumi import linode:index/nodeBalancerNode:NodeBalancerNode https-foobar-1 1234567,7654321,9999999
        ```

         The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for NodeBalancer Nodes and other Linode resource types.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address: The private IP Address where this backend can be reached. This must be a private IP address.
        :param pulumi.Input[int] config_id: The ID of the NodeBalancerConfig to access.
        :param pulumi.Input[str] label: The label of the Linode NodeBalancer Node. This is for display purposes only.
        :param pulumi.Input[str] mode: The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it
        :param pulumi.Input[int] nodebalancer_id: The ID of the NodeBalancer to access.
        :param pulumi.Input[int] weight: Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NodeBalancerNodeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Linode NodeBalancer Node resource.  This can be used to create, modify, and delete Linodes NodeBalancer Nodes.
        For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancerNode).

        ## Example Usage

        The following example shows how one might use this resource to configure NodeBalancer Nodes attached to Linode instances.

        ```python
        import pulumi
        import pulumi_linode as linode

        web = []
        for range in [{"value": i} for i in range(0, 3)]:
            web.append(linode.Instance(f"web-{range['value']}",
                authorized_keys=["ssh-rsa AAAA...Gw== user@example.local"],
                image="linode/ubuntu18.04",
                label=f"web-{range['value'] + 1}",
                private_ip=True,
                region="us-east",
                root_pass="test",
                type="g6-standard-1"))
        foobar = linode.NodeBalancer("foobar",
            client_conn_throttle=20,
            label="mynodebalancer",
            region="us-east")
        foofig = linode.NodeBalancerConfig("foofig",
            algorithm="source",
            check="http",
            check_attempts=3,
            check_path="/foo",
            check_timeout=30,
            nodebalancer_id=foobar.id,
            port=80,
            protocol="http",
            stickiness="http_cookie")
        foonode = []
        for range in [{"value": i} for i in range(0, 3)]:
            foonode.append(linode.NodeBalancerNode(f"foonode-{range['value']}",
                address=[__item.private_ip_address for __item in web][range["value"]].apply(lambda private_ip_addresses: f"{private_ip_addresses}:80"),
                config_id=foofig.id,
                label="mynodebalancernode",
                nodebalancer_id=foobar.id,
                weight=50))
        ```
        ## Attributes

        This resource exports the following attributes:

        * `status` - The current status of this node, based on the configured checks of its NodeBalancer Config. (unknown, UP, DOWN).

        * `config_id` - The ID of the NodeBalancerConfig this NodeBalancerNode is attached to.

        * `nodebalancer_id` - The ID of the NodeBalancer this NodeBalancerNode is attached to.

        ## Import

        NodeBalancer Nodes can be imported using the NodeBalancer `nodebalancer_id` followed by the NodeBalancer Config `config_id` followed by the NodeBalancer Node `id`, separated by a comma, e.g.

        ```sh
         $ pulumi import linode:index/nodeBalancerNode:NodeBalancerNode https-foobar-1 1234567,7654321,9999999
        ```

         The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for NodeBalancer Nodes and other Linode resource types.

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
                 address: Optional[pulumi.Input[str]] = None,
                 config_id: Optional[pulumi.Input[int]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 nodebalancer_id: Optional[pulumi.Input[int]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if address is None and not opts.urn:
                raise TypeError("Missing required property 'address'")
            __props__['address'] = address
            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__['config_id'] = config_id
            if label is None and not opts.urn:
                raise TypeError("Missing required property 'label'")
            __props__['label'] = label
            __props__['mode'] = mode
            if nodebalancer_id is None and not opts.urn:
                raise TypeError("Missing required property 'nodebalancer_id'")
            __props__['nodebalancer_id'] = nodebalancer_id
            __props__['weight'] = weight
            __props__['status'] = None
        super(NodeBalancerNode, __self__).__init__(
            'linode:index/nodeBalancerNode:NodeBalancerNode',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            address: Optional[pulumi.Input[str]] = None,
            config_id: Optional[pulumi.Input[int]] = None,
            label: Optional[pulumi.Input[str]] = None,
            mode: Optional[pulumi.Input[str]] = None,
            nodebalancer_id: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None,
            weight: Optional[pulumi.Input[int]] = None) -> 'NodeBalancerNode':
        """
        Get an existing NodeBalancerNode resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address: The private IP Address where this backend can be reached. This must be a private IP address.
        :param pulumi.Input[int] config_id: The ID of the NodeBalancerConfig to access.
        :param pulumi.Input[str] label: The label of the Linode NodeBalancer Node. This is for display purposes only.
        :param pulumi.Input[str] mode: The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it
        :param pulumi.Input[int] nodebalancer_id: The ID of the NodeBalancer to access.
        :param pulumi.Input[str] status: The current status of this node, based on the configured checks of its NodeBalancer Config. (unknown, UP, DOWN)
        :param pulumi.Input[int] weight: Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["address"] = address
        __props__["config_id"] = config_id
        __props__["label"] = label
        __props__["mode"] = mode
        __props__["nodebalancer_id"] = nodebalancer_id
        __props__["status"] = status
        __props__["weight"] = weight
        return NodeBalancerNode(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Output[str]:
        """
        The private IP Address where this backend can be reached. This must be a private IP address.
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[int]:
        """
        The ID of the NodeBalancerConfig to access.
        """
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[str]:
        """
        The label of the Linode NodeBalancer Node. This is for display purposes only.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Output[str]:
        """
        The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter(name="nodebalancerId")
    def nodebalancer_id(self) -> pulumi.Output[int]:
        """
        The ID of the NodeBalancer to access.
        """
        return pulumi.get(self, "nodebalancer_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The current status of this node, based on the configured checks of its NodeBalancer Config. (unknown, UP, DOWN)
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Output[int]:
        """
        Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
        """
        return pulumi.get(self, "weight")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

