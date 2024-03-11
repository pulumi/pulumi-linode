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

__all__ = ['VpcSubnetArgs', 'VpcSubnet']

@pulumi.input_type
class VpcSubnetArgs:
    def __init__(__self__, *,
                 ipv4: pulumi.Input[str],
                 label: pulumi.Input[str],
                 vpc_id: pulumi.Input[int]):
        """
        The set of arguments for constructing a VpcSubnet resource.
        :param pulumi.Input[str] ipv4: The IPv4 range of this subnet in CIDR format.
        :param pulumi.Input[str] label: The label of the VPC. Only contains ASCII letters, digits and dashes.
        :param pulumi.Input[int] vpc_id: The id of the parent VPC for this VPC Subnet.
        """
        pulumi.set(__self__, "ipv4", ipv4)
        pulumi.set(__self__, "label", label)
        pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def ipv4(self) -> pulumi.Input[str]:
        """
        The IPv4 range of this subnet in CIDR format.
        """
        return pulumi.get(self, "ipv4")

    @ipv4.setter
    def ipv4(self, value: pulumi.Input[str]):
        pulumi.set(self, "ipv4", value)

    @property
    @pulumi.getter
    def label(self) -> pulumi.Input[str]:
        """
        The label of the VPC. Only contains ASCII letters, digits and dashes.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: pulumi.Input[str]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Input[int]:
        """
        The id of the parent VPC for this VPC Subnet.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "vpc_id", value)


@pulumi.input_type
class _VpcSubnetState:
    def __init__(__self__, *,
                 created: Optional[pulumi.Input[str]] = None,
                 ipv4: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 linodes: Optional[pulumi.Input[Sequence[pulumi.Input['VpcSubnetLinodeArgs']]]] = None,
                 updated: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering VpcSubnet resources.
        :param pulumi.Input[str] created: The date and time when the VPC was created.
        :param pulumi.Input[str] ipv4: The IPv4 range of this subnet in CIDR format.
        :param pulumi.Input[str] label: The label of the VPC. Only contains ASCII letters, digits and dashes.
        :param pulumi.Input[Sequence[pulumi.Input['VpcSubnetLinodeArgs']]] linodes: A list of Linode IDs that added to this subnet.
        :param pulumi.Input[str] updated: The date and time when the VPC was last updated.
        :param pulumi.Input[int] vpc_id: The id of the parent VPC for this VPC Subnet.
        """
        if created is not None:
            pulumi.set(__self__, "created", created)
        if ipv4 is not None:
            pulumi.set(__self__, "ipv4", ipv4)
        if label is not None:
            pulumi.set(__self__, "label", label)
        if linodes is not None:
            pulumi.set(__self__, "linodes", linodes)
        if updated is not None:
            pulumi.set(__self__, "updated", updated)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def created(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time when the VPC was created.
        """
        return pulumi.get(self, "created")

    @created.setter
    def created(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created", value)

    @property
    @pulumi.getter
    def ipv4(self) -> Optional[pulumi.Input[str]]:
        """
        The IPv4 range of this subnet in CIDR format.
        """
        return pulumi.get(self, "ipv4")

    @ipv4.setter
    def ipv4(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipv4", value)

    @property
    @pulumi.getter
    def label(self) -> Optional[pulumi.Input[str]]:
        """
        The label of the VPC. Only contains ASCII letters, digits and dashes.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter
    def linodes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VpcSubnetLinodeArgs']]]]:
        """
        A list of Linode IDs that added to this subnet.
        """
        return pulumi.get(self, "linodes")

    @linodes.setter
    def linodes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VpcSubnetLinodeArgs']]]]):
        pulumi.set(self, "linodes", value)

    @property
    @pulumi.getter
    def updated(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time when the VPC was last updated.
        """
        return pulumi.get(self, "updated")

    @updated.setter
    def updated(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[int]]:
        """
        The id of the parent VPC for this VPC Subnet.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vpc_id", value)


class VpcSubnet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ipv4: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Manages a Linode VPC subnet.

        ## Example Usage

        Create a VPC subnet:

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_linode as linode

        test = linode.VpcSubnet("test",
            ipv4="10.0.0.0/24",
            label="test-subnet",
            vpc_id=123)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Linode Virtual Private Cloud (VPC) Subnet can be imported using the `vpc_id` followed by the subnet `id` separated by a comma, e.g.

        ```sh
        $ pulumi import linode:index/vpcSubnet:VpcSubnet my_subnet_duplicated 1234567,7654321
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ipv4: The IPv4 range of this subnet in CIDR format.
        :param pulumi.Input[str] label: The label of the VPC. Only contains ASCII letters, digits and dashes.
        :param pulumi.Input[int] vpc_id: The id of the parent VPC for this VPC Subnet.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VpcSubnetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Linode VPC subnet.

        ## Example Usage

        Create a VPC subnet:

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_linode as linode

        test = linode.VpcSubnet("test",
            ipv4="10.0.0.0/24",
            label="test-subnet",
            vpc_id=123)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Linode Virtual Private Cloud (VPC) Subnet can be imported using the `vpc_id` followed by the subnet `id` separated by a comma, e.g.

        ```sh
        $ pulumi import linode:index/vpcSubnet:VpcSubnet my_subnet_duplicated 1234567,7654321
        ```

        :param str resource_name: The name of the resource.
        :param VpcSubnetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpcSubnetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ipv4: Optional[pulumi.Input[str]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpcSubnetArgs.__new__(VpcSubnetArgs)

            if ipv4 is None and not opts.urn:
                raise TypeError("Missing required property 'ipv4'")
            __props__.__dict__["ipv4"] = ipv4
            if label is None and not opts.urn:
                raise TypeError("Missing required property 'label'")
            __props__.__dict__["label"] = label
            if vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_id'")
            __props__.__dict__["vpc_id"] = vpc_id
            __props__.__dict__["created"] = None
            __props__.__dict__["linodes"] = None
            __props__.__dict__["updated"] = None
        super(VpcSubnet, __self__).__init__(
            'linode:index/vpcSubnet:VpcSubnet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created: Optional[pulumi.Input[str]] = None,
            ipv4: Optional[pulumi.Input[str]] = None,
            label: Optional[pulumi.Input[str]] = None,
            linodes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VpcSubnetLinodeArgs']]]]] = None,
            updated: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[int]] = None) -> 'VpcSubnet':
        """
        Get an existing VpcSubnet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created: The date and time when the VPC was created.
        :param pulumi.Input[str] ipv4: The IPv4 range of this subnet in CIDR format.
        :param pulumi.Input[str] label: The label of the VPC. Only contains ASCII letters, digits and dashes.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VpcSubnetLinodeArgs']]]] linodes: A list of Linode IDs that added to this subnet.
        :param pulumi.Input[str] updated: The date and time when the VPC was last updated.
        :param pulumi.Input[int] vpc_id: The id of the parent VPC for this VPC Subnet.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpcSubnetState.__new__(_VpcSubnetState)

        __props__.__dict__["created"] = created
        __props__.__dict__["ipv4"] = ipv4
        __props__.__dict__["label"] = label
        __props__.__dict__["linodes"] = linodes
        __props__.__dict__["updated"] = updated
        __props__.__dict__["vpc_id"] = vpc_id
        return VpcSubnet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[str]:
        """
        The date and time when the VPC was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def ipv4(self) -> pulumi.Output[str]:
        """
        The IPv4 range of this subnet in CIDR format.
        """
        return pulumi.get(self, "ipv4")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[str]:
        """
        The label of the VPC. Only contains ASCII letters, digits and dashes.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def linodes(self) -> pulumi.Output[Sequence['outputs.VpcSubnetLinode']]:
        """
        A list of Linode IDs that added to this subnet.
        """
        return pulumi.get(self, "linodes")

    @property
    @pulumi.getter
    def updated(self) -> pulumi.Output[str]:
        """
        The date and time when the VPC was last updated.
        """
        return pulumi.get(self, "updated")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[int]:
        """
        The id of the parent VPC for this VPC Subnet.
        """
        return pulumi.get(self, "vpc_id")

