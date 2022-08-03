# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['Ipv6RangeArgs', 'Ipv6Range']

@pulumi.input_type
class Ipv6RangeArgs:
    def __init__(__self__, *,
                 prefix_length: pulumi.Input[int],
                 linode_id: Optional[pulumi.Input[int]] = None,
                 route_target: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Ipv6Range resource.
        :param pulumi.Input[int] prefix_length: The prefix length of the IPv6 range.
        :param pulumi.Input[int] linode_id: The ID of the Linode to assign this range to. This field may be updated to reassign the IPv6 range.
        :param pulumi.Input[str] route_target: The IPv6 SLAAC address to assign this range to.
        """
        pulumi.set(__self__, "prefix_length", prefix_length)
        if linode_id is not None:
            pulumi.set(__self__, "linode_id", linode_id)
        if route_target is not None:
            pulumi.set(__self__, "route_target", route_target)

    @property
    @pulumi.getter(name="prefixLength")
    def prefix_length(self) -> pulumi.Input[int]:
        """
        The prefix length of the IPv6 range.
        """
        return pulumi.get(self, "prefix_length")

    @prefix_length.setter
    def prefix_length(self, value: pulumi.Input[int]):
        pulumi.set(self, "prefix_length", value)

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> Optional[pulumi.Input[int]]:
        """
        The ID of the Linode to assign this range to. This field may be updated to reassign the IPv6 range.
        """
        return pulumi.get(self, "linode_id")

    @linode_id.setter
    def linode_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "linode_id", value)

    @property
    @pulumi.getter(name="routeTarget")
    def route_target(self) -> Optional[pulumi.Input[str]]:
        """
        The IPv6 SLAAC address to assign this range to.
        """
        return pulumi.get(self, "route_target")

    @route_target.setter
    def route_target(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "route_target", value)


@pulumi.input_type
class _Ipv6RangeState:
    def __init__(__self__, *,
                 is_bgp: Optional[pulumi.Input[bool]] = None,
                 linode_id: Optional[pulumi.Input[int]] = None,
                 linodes: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 prefix_length: Optional[pulumi.Input[int]] = None,
                 range: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 route_target: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Ipv6Range resources.
        :param pulumi.Input[bool] is_bgp: Whether this IPv6 range is shared.
        :param pulumi.Input[int] linode_id: The ID of the Linode to assign this range to. This field may be updated to reassign the IPv6 range.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] linodes: A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
        :param pulumi.Input[int] prefix_length: The prefix length of the IPv6 range.
        :param pulumi.Input[str] range: The IPv6 range of addresses in this pool.
        :param pulumi.Input[str] region: The region for this range of IPv6 addresses.
        :param pulumi.Input[str] route_target: The IPv6 SLAAC address to assign this range to.
        """
        if is_bgp is not None:
            pulumi.set(__self__, "is_bgp", is_bgp)
        if linode_id is not None:
            pulumi.set(__self__, "linode_id", linode_id)
        if linodes is not None:
            pulumi.set(__self__, "linodes", linodes)
        if prefix_length is not None:
            pulumi.set(__self__, "prefix_length", prefix_length)
        if range is not None:
            pulumi.set(__self__, "range", range)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if route_target is not None:
            pulumi.set(__self__, "route_target", route_target)

    @property
    @pulumi.getter(name="isBgp")
    def is_bgp(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether this IPv6 range is shared.
        """
        return pulumi.get(self, "is_bgp")

    @is_bgp.setter
    def is_bgp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_bgp", value)

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> Optional[pulumi.Input[int]]:
        """
        The ID of the Linode to assign this range to. This field may be updated to reassign the IPv6 range.
        """
        return pulumi.get(self, "linode_id")

    @linode_id.setter
    def linode_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "linode_id", value)

    @property
    @pulumi.getter
    def linodes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]:
        """
        A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
        """
        return pulumi.get(self, "linodes")

    @linodes.setter
    def linodes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]):
        pulumi.set(self, "linodes", value)

    @property
    @pulumi.getter(name="prefixLength")
    def prefix_length(self) -> Optional[pulumi.Input[int]]:
        """
        The prefix length of the IPv6 range.
        """
        return pulumi.get(self, "prefix_length")

    @prefix_length.setter
    def prefix_length(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "prefix_length", value)

    @property
    @pulumi.getter
    def range(self) -> Optional[pulumi.Input[str]]:
        """
        The IPv6 range of addresses in this pool.
        """
        return pulumi.get(self, "range")

    @range.setter
    def range(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "range", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The region for this range of IPv6 addresses.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="routeTarget")
    def route_target(self) -> Optional[pulumi.Input[str]]:
        """
        The IPv6 SLAAC address to assign this range to.
        """
        return pulumi.get(self, "route_target")

    @route_target.setter
    def route_target(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "route_target", value)


class Ipv6Range(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 linode_id: Optional[pulumi.Input[int]] = None,
                 prefix_length: Optional[pulumi.Input[int]] = None,
                 route_target: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Linode IPv6 range.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_linode as linode

        foobar_instance = linode.Instance("foobarInstance",
            label="my-linode",
            image="linode/alpine3.14",
            type="g6-nanode-1",
            region="us-southeast")
        foobar_ipv6_range = linode.Ipv6Range("foobarIpv6Range",
            linode_id=foobar_instance.id,
            prefix_length=64)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] linode_id: The ID of the Linode to assign this range to. This field may be updated to reassign the IPv6 range.
        :param pulumi.Input[int] prefix_length: The prefix length of the IPv6 range.
        :param pulumi.Input[str] route_target: The IPv6 SLAAC address to assign this range to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Ipv6RangeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Linode IPv6 range.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_linode as linode

        foobar_instance = linode.Instance("foobarInstance",
            label="my-linode",
            image="linode/alpine3.14",
            type="g6-nanode-1",
            region="us-southeast")
        foobar_ipv6_range = linode.Ipv6Range("foobarIpv6Range",
            linode_id=foobar_instance.id,
            prefix_length=64)
        ```

        :param str resource_name: The name of the resource.
        :param Ipv6RangeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(Ipv6RangeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 linode_id: Optional[pulumi.Input[int]] = None,
                 prefix_length: Optional[pulumi.Input[int]] = None,
                 route_target: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = Ipv6RangeArgs.__new__(Ipv6RangeArgs)

            __props__.__dict__["linode_id"] = linode_id
            if prefix_length is None and not opts.urn:
                raise TypeError("Missing required property 'prefix_length'")
            __props__.__dict__["prefix_length"] = prefix_length
            __props__.__dict__["route_target"] = route_target
            __props__.__dict__["is_bgp"] = None
            __props__.__dict__["linodes"] = None
            __props__.__dict__["range"] = None
            __props__.__dict__["region"] = None
        super(Ipv6Range, __self__).__init__(
            'linode:index/ipv6Range:Ipv6Range',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            is_bgp: Optional[pulumi.Input[bool]] = None,
            linode_id: Optional[pulumi.Input[int]] = None,
            linodes: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
            prefix_length: Optional[pulumi.Input[int]] = None,
            range: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            route_target: Optional[pulumi.Input[str]] = None) -> 'Ipv6Range':
        """
        Get an existing Ipv6Range resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] is_bgp: Whether this IPv6 range is shared.
        :param pulumi.Input[int] linode_id: The ID of the Linode to assign this range to. This field may be updated to reassign the IPv6 range.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] linodes: A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
        :param pulumi.Input[int] prefix_length: The prefix length of the IPv6 range.
        :param pulumi.Input[str] range: The IPv6 range of addresses in this pool.
        :param pulumi.Input[str] region: The region for this range of IPv6 addresses.
        :param pulumi.Input[str] route_target: The IPv6 SLAAC address to assign this range to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _Ipv6RangeState.__new__(_Ipv6RangeState)

        __props__.__dict__["is_bgp"] = is_bgp
        __props__.__dict__["linode_id"] = linode_id
        __props__.__dict__["linodes"] = linodes
        __props__.__dict__["prefix_length"] = prefix_length
        __props__.__dict__["range"] = range
        __props__.__dict__["region"] = region
        __props__.__dict__["route_target"] = route_target
        return Ipv6Range(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="isBgp")
    def is_bgp(self) -> pulumi.Output[bool]:
        """
        Whether this IPv6 range is shared.
        """
        return pulumi.get(self, "is_bgp")

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> pulumi.Output[Optional[int]]:
        """
        The ID of the Linode to assign this range to. This field may be updated to reassign the IPv6 range.
        """
        return pulumi.get(self, "linode_id")

    @property
    @pulumi.getter
    def linodes(self) -> pulumi.Output[Sequence[int]]:
        """
        A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
        """
        return pulumi.get(self, "linodes")

    @property
    @pulumi.getter(name="prefixLength")
    def prefix_length(self) -> pulumi.Output[int]:
        """
        The prefix length of the IPv6 range.
        """
        return pulumi.get(self, "prefix_length")

    @property
    @pulumi.getter
    def range(self) -> pulumi.Output[str]:
        """
        The IPv6 range of addresses in this pool.
        """
        return pulumi.get(self, "range")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The region for this range of IPv6 addresses.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="routeTarget")
    def route_target(self) -> pulumi.Output[Optional[str]]:
        """
        The IPv6 SLAAC address to assign this range to.
        """
        return pulumi.get(self, "route_target")

