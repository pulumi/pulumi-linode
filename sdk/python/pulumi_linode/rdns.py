# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['RdnsArgs', 'Rdns']

@pulumi.input_type
class RdnsArgs:
    def __init__(__self__, *,
                 address: pulumi.Input[str],
                 rdns: pulumi.Input[str],
                 timeouts: Optional[pulumi.Input['RdnsTimeoutsArgs']] = None,
                 wait_for_available: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Rdns resource.
        :param pulumi.Input[str] address: The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
        :param pulumi.Input[str] rdns: The name of the RDNS address.
        :param pulumi.Input[bool] wait_for_available: If true, the RDNS assignment will be retried within the operation timeout period.
        """
        pulumi.set(__self__, "address", address)
        pulumi.set(__self__, "rdns", rdns)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)
        if wait_for_available is not None:
            pulumi.set(__self__, "wait_for_available", wait_for_available)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Input[str]:
        """
        The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: pulumi.Input[str]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter
    def rdns(self) -> pulumi.Input[str]:
        """
        The name of the RDNS address.
        """
        return pulumi.get(self, "rdns")

    @rdns.setter
    def rdns(self, value: pulumi.Input[str]):
        pulumi.set(self, "rdns", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['RdnsTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['RdnsTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)

    @property
    @pulumi.getter(name="waitForAvailable")
    def wait_for_available(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, the RDNS assignment will be retried within the operation timeout period.
        """
        return pulumi.get(self, "wait_for_available")

    @wait_for_available.setter
    def wait_for_available(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wait_for_available", value)


@pulumi.input_type
class _RdnsState:
    def __init__(__self__, *,
                 address: Optional[pulumi.Input[str]] = None,
                 rdns: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input['RdnsTimeoutsArgs']] = None,
                 wait_for_available: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering Rdns resources.
        :param pulumi.Input[str] address: The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
        :param pulumi.Input[str] rdns: The name of the RDNS address.
        :param pulumi.Input[bool] wait_for_available: If true, the RDNS assignment will be retried within the operation timeout period.
        """
        if address is not None:
            pulumi.set(__self__, "address", address)
        if rdns is not None:
            pulumi.set(__self__, "rdns", rdns)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)
        if wait_for_available is not None:
            pulumi.set(__self__, "wait_for_available", wait_for_available)

    @property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input[str]]:
        """
        The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter
    def rdns(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the RDNS address.
        """
        return pulumi.get(self, "rdns")

    @rdns.setter
    def rdns(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rdns", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['RdnsTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['RdnsTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)

    @property
    @pulumi.getter(name="waitForAvailable")
    def wait_for_available(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, the RDNS assignment will be retried within the operation timeout period.
        """
        return pulumi.get(self, "wait_for_available")

    @wait_for_available.setter
    def wait_for_available(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wait_for_available", value)


class Rdns(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[str]] = None,
                 rdns: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['RdnsTimeoutsArgs']]] = None,
                 wait_for_available: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Provides a Linode RDNS resource.  This can be used to create and modify RDNS records.

        Linode RDNS names must have a matching address value in an A or AAAA record.  This A or AAAA name must be resolvable at the time the RDNS resource is being associated.

        For more information, see the [Linode APIv4 docs](https://developers.linode.com/api/v4/networking-ips-address/#put) and the [Configure your Linode for Reverse DNS](https://www.linode.com/docs/networking/dns/configure-your-linode-for-reverse-dns-classic-manager/) guide.

        ## Example Usage

        The following example shows how one might use this resource to configure an RDNS address for an IP address.

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_linode as linode

        foo_instance = linode.Instance("fooInstance",
            image="linode/alpine3.19",
            region="ca-east",
            type="g6-dedicated-2")
        foo_rdns = linode.Rdns("fooRdns",
            address=foo_instance.ip_address,
            rdns=foo_instance.ip_address.apply(lambda ip_address: f"{ip_address}.nip.io"))
        ```
        <!--End PulumiCodeChooser -->

        The following example shows how one might use this resource to configure RDNS for multiple IP addresses.

        ## Import

        Linodes RDNS resources can be imported using the address as the `id`.

        ```sh
        $ pulumi import linode:index/rdns:Rdns foo 123.123.123.123
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address: The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
        :param pulumi.Input[str] rdns: The name of the RDNS address.
        :param pulumi.Input[bool] wait_for_available: If true, the RDNS assignment will be retried within the operation timeout period.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RdnsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Linode RDNS resource.  This can be used to create and modify RDNS records.

        Linode RDNS names must have a matching address value in an A or AAAA record.  This A or AAAA name must be resolvable at the time the RDNS resource is being associated.

        For more information, see the [Linode APIv4 docs](https://developers.linode.com/api/v4/networking-ips-address/#put) and the [Configure your Linode for Reverse DNS](https://www.linode.com/docs/networking/dns/configure-your-linode-for-reverse-dns-classic-manager/) guide.

        ## Example Usage

        The following example shows how one might use this resource to configure an RDNS address for an IP address.

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_linode as linode

        foo_instance = linode.Instance("fooInstance",
            image="linode/alpine3.19",
            region="ca-east",
            type="g6-dedicated-2")
        foo_rdns = linode.Rdns("fooRdns",
            address=foo_instance.ip_address,
            rdns=foo_instance.ip_address.apply(lambda ip_address: f"{ip_address}.nip.io"))
        ```
        <!--End PulumiCodeChooser -->

        The following example shows how one might use this resource to configure RDNS for multiple IP addresses.

        ## Import

        Linodes RDNS resources can be imported using the address as the `id`.

        ```sh
        $ pulumi import linode:index/rdns:Rdns foo 123.123.123.123
        ```

        :param str resource_name: The name of the resource.
        :param RdnsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RdnsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[str]] = None,
                 rdns: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input[pulumi.InputType['RdnsTimeoutsArgs']]] = None,
                 wait_for_available: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RdnsArgs.__new__(RdnsArgs)

            if address is None and not opts.urn:
                raise TypeError("Missing required property 'address'")
            __props__.__dict__["address"] = address
            if rdns is None and not opts.urn:
                raise TypeError("Missing required property 'rdns'")
            __props__.__dict__["rdns"] = rdns
            __props__.__dict__["timeouts"] = timeouts
            __props__.__dict__["wait_for_available"] = wait_for_available
        super(Rdns, __self__).__init__(
            'linode:index/rdns:Rdns',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            address: Optional[pulumi.Input[str]] = None,
            rdns: Optional[pulumi.Input[str]] = None,
            timeouts: Optional[pulumi.Input[pulumi.InputType['RdnsTimeoutsArgs']]] = None,
            wait_for_available: Optional[pulumi.Input[bool]] = None) -> 'Rdns':
        """
        Get an existing Rdns resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address: The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
        :param pulumi.Input[str] rdns: The name of the RDNS address.
        :param pulumi.Input[bool] wait_for_available: If true, the RDNS assignment will be retried within the operation timeout period.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RdnsState.__new__(_RdnsState)

        __props__.__dict__["address"] = address
        __props__.__dict__["rdns"] = rdns
        __props__.__dict__["timeouts"] = timeouts
        __props__.__dict__["wait_for_available"] = wait_for_available
        return Rdns(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Output[str]:
        """
        The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter
    def rdns(self) -> pulumi.Output[str]:
        """
        The name of the RDNS address.
        """
        return pulumi.get(self, "rdns")

    @property
    @pulumi.getter
    def timeouts(self) -> pulumi.Output[Optional['outputs.RdnsTimeouts']]:
        return pulumi.get(self, "timeouts")

    @property
    @pulumi.getter(name="waitForAvailable")
    def wait_for_available(self) -> pulumi.Output[bool]:
        """
        If true, the RDNS assignment will be retried within the operation timeout period.
        """
        return pulumi.get(self, "wait_for_available")

