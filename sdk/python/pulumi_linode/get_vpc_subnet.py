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

__all__ = [
    'GetVpcSubnetResult',
    'AwaitableGetVpcSubnetResult',
    'get_vpc_subnet',
    'get_vpc_subnet_output',
]

@pulumi.output_type
class GetVpcSubnetResult:
    """
    A collection of values returned by getVpcSubnet.
    """
    def __init__(__self__, created=None, id=None, ipv4=None, label=None, linodes=None, updated=None, vpc_id=None):
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if ipv4 and not isinstance(ipv4, str):
            raise TypeError("Expected argument 'ipv4' to be a str")
        pulumi.set(__self__, "ipv4", ipv4)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if linodes and not isinstance(linodes, list):
            raise TypeError("Expected argument 'linodes' to be a list")
        pulumi.set(__self__, "linodes", linodes)
        if updated and not isinstance(updated, str):
            raise TypeError("Expected argument 'updated' to be a str")
        pulumi.set(__self__, "updated", updated)
        if vpc_id and not isinstance(vpc_id, int):
            raise TypeError("Expected argument 'vpc_id' to be a int")
        pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def created(self) -> str:
        """
        The date and time when the VPC Subnet was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def id(self) -> int:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ipv4(self) -> str:
        """
        The IPv4 range of this subnet in CIDR format.
        """
        return pulumi.get(self, "ipv4")

    @property
    @pulumi.getter
    def label(self) -> str:
        """
        The label of the VPC subnet.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def linodes(self) -> Sequence['outputs.GetVpcSubnetLinodeResult']:
        """
        A list of Linode IDs that added to this subnet.
        """
        return pulumi.get(self, "linodes")

    @property
    @pulumi.getter
    def updated(self) -> str:
        """
        The date and time when the VPC Subnet was last updated.
        """
        return pulumi.get(self, "updated")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> int:
        return pulumi.get(self, "vpc_id")


class AwaitableGetVpcSubnetResult(GetVpcSubnetResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVpcSubnetResult(
            created=self.created,
            id=self.id,
            ipv4=self.ipv4,
            label=self.label,
            linodes=self.linodes,
            updated=self.updated,
            vpc_id=self.vpc_id)


def get_vpc_subnet(id: Optional[int] = None,
                   vpc_id: Optional[int] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVpcSubnetResult:
    """
    Provides information about a Linode VPC subnet.

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode VPC subnet.

    ```python
    import pulumi
    import pulumi_linode as linode

    foo = linode.get_vpc_subnet(vpc_id=123,
        id=12345)
    pulumi.export("vpcSubnet", foo)
    ```


    :param int id: The unique id of this VPC subnet.
    :param int vpc_id: The id of the parent VPC for this VPC Subnet.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['vpcId'] = vpc_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getVpcSubnet:getVpcSubnet', __args__, opts=opts, typ=GetVpcSubnetResult).value

    return AwaitableGetVpcSubnetResult(
        created=pulumi.get(__ret__, 'created'),
        id=pulumi.get(__ret__, 'id'),
        ipv4=pulumi.get(__ret__, 'ipv4'),
        label=pulumi.get(__ret__, 'label'),
        linodes=pulumi.get(__ret__, 'linodes'),
        updated=pulumi.get(__ret__, 'updated'),
        vpc_id=pulumi.get(__ret__, 'vpc_id'))


@_utilities.lift_output_func(get_vpc_subnet)
def get_vpc_subnet_output(id: Optional[pulumi.Input[int]] = None,
                          vpc_id: Optional[pulumi.Input[int]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVpcSubnetResult]:
    """
    Provides information about a Linode VPC subnet.

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode VPC subnet.

    ```python
    import pulumi
    import pulumi_linode as linode

    foo = linode.get_vpc_subnet(vpc_id=123,
        id=12345)
    pulumi.export("vpcSubnet", foo)
    ```


    :param int id: The unique id of this VPC subnet.
    :param int vpc_id: The id of the parent VPC for this VPC Subnet.
    """
    ...
