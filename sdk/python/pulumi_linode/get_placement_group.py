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

__all__ = [
    'GetPlacementGroupResult',
    'AwaitableGetPlacementGroupResult',
    'get_placement_group',
    'get_placement_group_output',
]

@pulumi.output_type
class GetPlacementGroupResult:
    """
    A collection of values returned by getPlacementGroup.
    """
    def __init__(__self__, id=None, is_compliant=None, label=None, members=None, placement_group_policy=None, placement_group_type=None, region=None):
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if is_compliant and not isinstance(is_compliant, bool):
            raise TypeError("Expected argument 'is_compliant' to be a bool")
        pulumi.set(__self__, "is_compliant", is_compliant)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if members and not isinstance(members, list):
            raise TypeError("Expected argument 'members' to be a list")
        pulumi.set(__self__, "members", members)
        if placement_group_policy and not isinstance(placement_group_policy, str):
            raise TypeError("Expected argument 'placement_group_policy' to be a str")
        pulumi.set(__self__, "placement_group_policy", placement_group_policy)
        if placement_group_type and not isinstance(placement_group_type, str):
            raise TypeError("Expected argument 'placement_group_type' to be a str")
        pulumi.set(__self__, "placement_group_type", placement_group_type)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def id(self) -> int:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isCompliant")
    def is_compliant(self) -> bool:
        """
        Whether this Linode is currently compliant with the group's placement group type.
        """
        return pulumi.get(self, "is_compliant")

    @property
    @pulumi.getter
    def label(self) -> str:
        """
        The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def members(self) -> Optional[Sequence['outputs.GetPlacementGroupMemberResult']]:
        """
        A set of Linodes currently assigned to this Placement Group.
        """
        return pulumi.get(self, "members")

    @property
    @pulumi.getter(name="placementGroupPolicy")
    def placement_group_policy(self) -> str:
        """
        Whether Linodes must be able to become compliant during assignment. (Default `strict`)
        """
        return pulumi.get(self, "placement_group_policy")

    @property
    @pulumi.getter(name="placementGroupType")
    def placement_group_type(self) -> str:
        """
        The placement group type to use when placing Linodes in this group.
        """
        return pulumi.get(self, "placement_group_type")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        The region of the Placement Group.
        """
        return pulumi.get(self, "region")


class AwaitableGetPlacementGroupResult(GetPlacementGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPlacementGroupResult(
            id=self.id,
            is_compliant=self.is_compliant,
            label=self.label,
            members=self.members,
            placement_group_policy=self.placement_group_policy,
            placement_group_type=self.placement_group_type,
            region=self.region)


def get_placement_group(id: Optional[int] = None,
                        members: Optional[Sequence[pulumi.InputType['GetPlacementGroupMemberArgs']]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPlacementGroupResult:
    """
    **NOTE: Placement Groups may not currently be available to all users.**

    `PlacementGroup` provides details about a Linode placement group.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-placement-group).

    ## Example Usage

    The following example shows how the resource might be used to obtain additional information about a Linode placement group.

    ```python
    import pulumi
    import pulumi_linode as linode

    pg = linode.get_placement_group(id=12345)
    ```


    :param int id: The ID of the Placement Group.
    :param Sequence[pulumi.InputType['GetPlacementGroupMemberArgs']] members: A set of Linodes currently assigned to this Placement Group.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['members'] = members
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getPlacementGroup:getPlacementGroup', __args__, opts=opts, typ=GetPlacementGroupResult).value

    return AwaitableGetPlacementGroupResult(
        id=pulumi.get(__ret__, 'id'),
        is_compliant=pulumi.get(__ret__, 'is_compliant'),
        label=pulumi.get(__ret__, 'label'),
        members=pulumi.get(__ret__, 'members'),
        placement_group_policy=pulumi.get(__ret__, 'placement_group_policy'),
        placement_group_type=pulumi.get(__ret__, 'placement_group_type'),
        region=pulumi.get(__ret__, 'region'))


@_utilities.lift_output_func(get_placement_group)
def get_placement_group_output(id: Optional[pulumi.Input[int]] = None,
                               members: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetPlacementGroupMemberArgs']]]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPlacementGroupResult]:
    """
    **NOTE: Placement Groups may not currently be available to all users.**

    `PlacementGroup` provides details about a Linode placement group.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-placement-group).

    ## Example Usage

    The following example shows how the resource might be used to obtain additional information about a Linode placement group.

    ```python
    import pulumi
    import pulumi_linode as linode

    pg = linode.get_placement_group(id=12345)
    ```


    :param int id: The ID of the Placement Group.
    :param Sequence[pulumi.InputType['GetPlacementGroupMemberArgs']] members: A set of Linodes currently assigned to this Placement Group.
    """
    ...
