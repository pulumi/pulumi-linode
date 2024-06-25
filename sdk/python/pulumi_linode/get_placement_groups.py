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
    'GetPlacementGroupsResult',
    'AwaitableGetPlacementGroupsResult',
    'get_placement_groups',
    'get_placement_groups_output',
]

@pulumi.output_type
class GetPlacementGroupsResult:
    """
    A collection of values returned by getPlacementGroups.
    """
    def __init__(__self__, filters=None, id=None, order=None, order_by=None, placement_groups=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if order and not isinstance(order, str):
            raise TypeError("Expected argument 'order' to be a str")
        pulumi.set(__self__, "order", order)
        if order_by and not isinstance(order_by, str):
            raise TypeError("Expected argument 'order_by' to be a str")
        pulumi.set(__self__, "order_by", order_by)
        if placement_groups and not isinstance(placement_groups, list):
            raise TypeError("Expected argument 'placement_groups' to be a list")
        pulumi.set(__self__, "placement_groups", placement_groups)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetPlacementGroupsFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def order(self) -> Optional[str]:
        return pulumi.get(self, "order")

    @property
    @pulumi.getter(name="orderBy")
    def order_by(self) -> Optional[str]:
        return pulumi.get(self, "order_by")

    @property
    @pulumi.getter(name="placementGroups")
    def placement_groups(self) -> Optional[Sequence['outputs.GetPlacementGroupsPlacementGroupResult']]:
        return pulumi.get(self, "placement_groups")


class AwaitableGetPlacementGroupsResult(GetPlacementGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPlacementGroupsResult(
            filters=self.filters,
            id=self.id,
            order=self.order,
            order_by=self.order_by,
            placement_groups=self.placement_groups)


def get_placement_groups(filters: Optional[Sequence[pulumi.InputType['GetPlacementGroupsFilterArgs']]] = None,
                         order: Optional[str] = None,
                         order_by: Optional[str] = None,
                         placement_groups: Optional[Sequence[pulumi.InputType['GetPlacementGroupsPlacementGroupArgs']]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPlacementGroupsResult:
    """
    **NOTE: Placement Groups may not currently be available to all users.**

    Provides information about a list of Linode Placement Groups that match a set of filters.

    ## Example Usage

    The following example shows how one might use this data source to list Placement Groups.

    ```python
    import pulumi
    import pulumi_linode as linode

    all = linode.get_placement_groups()
    filtered = linode.get_placement_groups(filters=[linode.GetPlacementGroupsFilterArgs(
        name="label",
        values=["my-label"],
    )])
    pulumi.export("all-pgs", all.placement_groups)
    pulumi.export("filtered-pgs", filtered.placement_groups)
    ```

    ## Filterable Fields

    * `id`

    * `label`

    * `region`

    * `affinity_type`

    * `is_strict`

    * `is_compliant`
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['order'] = order
    __args__['orderBy'] = order_by
    __args__['placementGroups'] = placement_groups
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getPlacementGroups:getPlacementGroups', __args__, opts=opts, typ=GetPlacementGroupsResult).value

    return AwaitableGetPlacementGroupsResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        order=pulumi.get(__ret__, 'order'),
        order_by=pulumi.get(__ret__, 'order_by'),
        placement_groups=pulumi.get(__ret__, 'placement_groups'))


@_utilities.lift_output_func(get_placement_groups)
def get_placement_groups_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetPlacementGroupsFilterArgs']]]]] = None,
                                order: Optional[pulumi.Input[Optional[str]]] = None,
                                order_by: Optional[pulumi.Input[Optional[str]]] = None,
                                placement_groups: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetPlacementGroupsPlacementGroupArgs']]]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPlacementGroupsResult]:
    """
    **NOTE: Placement Groups may not currently be available to all users.**

    Provides information about a list of Linode Placement Groups that match a set of filters.

    ## Example Usage

    The following example shows how one might use this data source to list Placement Groups.

    ```python
    import pulumi
    import pulumi_linode as linode

    all = linode.get_placement_groups()
    filtered = linode.get_placement_groups(filters=[linode.GetPlacementGroupsFilterArgs(
        name="label",
        values=["my-label"],
    )])
    pulumi.export("all-pgs", all.placement_groups)
    pulumi.export("filtered-pgs", filtered.placement_groups)
    ```

    ## Filterable Fields

    * `id`

    * `label`

    * `region`

    * `affinity_type`

    * `is_strict`

    * `is_compliant`
    """
    ...
