# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetVpcResult',
    'AwaitableGetVpcResult',
    'get_vpc',
    'get_vpc_output',
]

@pulumi.output_type
class GetVpcResult:
    """
    A collection of values returned by getVpc.
    """
    def __init__(__self__, created=None, description=None, id=None, label=None, region=None, updated=None):
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if updated and not isinstance(updated, str):
            raise TypeError("Expected argument 'updated' to be a str")
        pulumi.set(__self__, "updated", updated)

    @property
    @pulumi.getter
    def created(self) -> str:
        """
        The date and time when the VPC was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The user-defined description of this VPC.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def label(self) -> str:
        """
        The label of the VPC.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        The region where the VPC is deployed.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def updated(self) -> str:
        """
        The date and time when the VPC was last updated.
        """
        return pulumi.get(self, "updated")


class AwaitableGetVpcResult(GetVpcResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVpcResult(
            created=self.created,
            description=self.description,
            id=self.id,
            label=self.label,
            region=self.region,
            updated=self.updated)


def get_vpc(id: Optional[str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVpcResult:
    """
    Provides information about a Linode VPC.

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode VPC.

    ```python
    import pulumi
    import pulumi_linode as linode

    foo = linode.get_vpc(id="123")
    pulumi.export("vpc", foo)
    ```


    :param str id: The unique id of this VPC.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getVpc:getVpc', __args__, opts=opts, typ=GetVpcResult).value

    return AwaitableGetVpcResult(
        created=pulumi.get(__ret__, 'created'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        label=pulumi.get(__ret__, 'label'),
        region=pulumi.get(__ret__, 'region'),
        updated=pulumi.get(__ret__, 'updated'))


@_utilities.lift_output_func(get_vpc)
def get_vpc_output(id: Optional[pulumi.Input[str]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVpcResult]:
    """
    Provides information about a Linode VPC.

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode VPC.

    ```python
    import pulumi
    import pulumi_linode as linode

    foo = linode.get_vpc(id="123")
    pulumi.export("vpc", foo)
    ```


    :param str id: The unique id of this VPC.
    """
    ...
