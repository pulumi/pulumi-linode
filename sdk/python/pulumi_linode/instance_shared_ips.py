# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['InstanceSharedIpsArgs', 'InstanceSharedIps']

@pulumi.input_type
class InstanceSharedIpsArgs:
    def __init__(__self__, *,
                 addresses: pulumi.Input[Sequence[pulumi.Input[str]]],
                 linode_id: pulumi.Input[int]):
        """
        The set of arguments for constructing a InstanceSharedIps resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] addresses: The set of IPs to share with the Linode.
        :param pulumi.Input[int] linode_id: The ID of the Linode to share the IPs to.
        """
        pulumi.set(__self__, "addresses", addresses)
        pulumi.set(__self__, "linode_id", linode_id)

    @property
    @pulumi.getter
    def addresses(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The set of IPs to share with the Linode.
        """
        return pulumi.get(self, "addresses")

    @addresses.setter
    def addresses(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "addresses", value)

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> pulumi.Input[int]:
        """
        The ID of the Linode to share the IPs to.
        """
        return pulumi.get(self, "linode_id")

    @linode_id.setter
    def linode_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "linode_id", value)


@pulumi.input_type
class _InstanceSharedIpsState:
    def __init__(__self__, *,
                 addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 linode_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering InstanceSharedIps resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] addresses: The set of IPs to share with the Linode.
        :param pulumi.Input[int] linode_id: The ID of the Linode to share the IPs to.
        """
        if addresses is not None:
            pulumi.set(__self__, "addresses", addresses)
        if linode_id is not None:
            pulumi.set(__self__, "linode_id", linode_id)

    @property
    @pulumi.getter
    def addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The set of IPs to share with the Linode.
        """
        return pulumi.get(self, "addresses")

    @addresses.setter
    def addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "addresses", value)

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> Optional[pulumi.Input[int]]:
        """
        The ID of the Linode to share the IPs to.
        """
        return pulumi.get(self, "linode_id")

    @linode_id.setter
    def linode_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "linode_id", value)


class InstanceSharedIps(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 linode_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        > **Beta Notice** IPv6 sharing is currently available through early access.
        To use early access resources, the `api_version` provider argument must be set to `v4beta`.
        To learn more, see the early access documentation.

        > **Notice** This resource should only be defined once per-instance and should not be used alongside the `shared_ipv4` field in `Instance`.

        Manages IPs shared to a Linode instance.

        ## Example Usage

        Share in IPv4 address between two instances:

        ```python
        import pulumi
        import pulumi_linode as linode

        # Create a single primary node
        primary_instance = linode.Instance("primaryInstance",
            label="node-primary",
            type="g6-nanode-1",
            region="eu-central")
        # Allocate an IP under the primary node
        primary_instance_ip = linode.InstanceIp("primaryInstanceIp", linode_id=primary_instance.id)
        # Create a secondary node
        secondary = linode.Instance("secondary",
            label="node-secondary",
            type="g6-nanode-1",
            region="eu-central")
        # Share the IP with the secondary node
        share_primary = linode.InstanceSharedIps("share-primary",
            linode_id=secondary.id,
            addresses=[primary_instance_ip.address])
        ```

        Share an IPv6 address among a primary node and its replicas:

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] addresses: The set of IPs to share with the Linode.
        :param pulumi.Input[int] linode_id: The ID of the Linode to share the IPs to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceSharedIpsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Beta Notice** IPv6 sharing is currently available through early access.
        To use early access resources, the `api_version` provider argument must be set to `v4beta`.
        To learn more, see the early access documentation.

        > **Notice** This resource should only be defined once per-instance and should not be used alongside the `shared_ipv4` field in `Instance`.

        Manages IPs shared to a Linode instance.

        ## Example Usage

        Share in IPv4 address between two instances:

        ```python
        import pulumi
        import pulumi_linode as linode

        # Create a single primary node
        primary_instance = linode.Instance("primaryInstance",
            label="node-primary",
            type="g6-nanode-1",
            region="eu-central")
        # Allocate an IP under the primary node
        primary_instance_ip = linode.InstanceIp("primaryInstanceIp", linode_id=primary_instance.id)
        # Create a secondary node
        secondary = linode.Instance("secondary",
            label="node-secondary",
            type="g6-nanode-1",
            region="eu-central")
        # Share the IP with the secondary node
        share_primary = linode.InstanceSharedIps("share-primary",
            linode_id=secondary.id,
            addresses=[primary_instance_ip.address])
        ```

        Share an IPv6 address among a primary node and its replicas:

        :param str resource_name: The name of the resource.
        :param InstanceSharedIpsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceSharedIpsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 linode_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceSharedIpsArgs.__new__(InstanceSharedIpsArgs)

            if addresses is None and not opts.urn:
                raise TypeError("Missing required property 'addresses'")
            __props__.__dict__["addresses"] = addresses
            if linode_id is None and not opts.urn:
                raise TypeError("Missing required property 'linode_id'")
            __props__.__dict__["linode_id"] = linode_id
        super(InstanceSharedIps, __self__).__init__(
            'linode:index/instanceSharedIps:InstanceSharedIps',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            linode_id: Optional[pulumi.Input[int]] = None) -> 'InstanceSharedIps':
        """
        Get an existing InstanceSharedIps resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] addresses: The set of IPs to share with the Linode.
        :param pulumi.Input[int] linode_id: The ID of the Linode to share the IPs to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceSharedIpsState.__new__(_InstanceSharedIpsState)

        __props__.__dict__["addresses"] = addresses
        __props__.__dict__["linode_id"] = linode_id
        return InstanceSharedIps(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def addresses(self) -> pulumi.Output[Sequence[str]]:
        """
        The set of IPs to share with the Linode.
        """
        return pulumi.get(self, "addresses")

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> pulumi.Output[int]:
        """
        The ID of the Linode to share the IPs to.
        """
        return pulumi.get(self, "linode_id")

