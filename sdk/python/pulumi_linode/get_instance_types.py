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
    'GetInstanceTypesResult',
    'AwaitableGetInstanceTypesResult',
    'get_instance_types',
    'get_instance_types_output',
]

@pulumi.output_type
class GetInstanceTypesResult:
    """
    A collection of values returned by getInstanceTypes.
    """
    def __init__(__self__, filters=None, id=None, order=None, order_by=None, types=None):
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
        if types and not isinstance(types, list):
            raise TypeError("Expected argument 'types' to be a list")
        pulumi.set(__self__, "types", types)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetInstanceTypesFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID representing the Linode Type.
        """
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
    @pulumi.getter
    def types(self) -> Optional[Sequence['outputs.GetInstanceTypesTypeResult']]:
        return pulumi.get(self, "types")


class AwaitableGetInstanceTypesResult(GetInstanceTypesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceTypesResult(
            filters=self.filters,
            id=self.id,
            order=self.order,
            order_by=self.order_by,
            types=self.types)


def get_instance_types(filters: Optional[Sequence[pulumi.InputType['GetInstanceTypesFilterArgs']]] = None,
                       order: Optional[str] = None,
                       order_by: Optional[str] = None,
                       types: Optional[Sequence[pulumi.InputType['GetInstanceTypesTypeArgs']]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceTypesResult:
    """
    Provides information about Linode Instance types that match a set of filters.

    ## Example Usage

    Get information about all Linode Instance types with a certain number of VCPUs:

    ```python
    import pulumi
    import pulumi_linode as linode

    specific_types = linode.get_instance_types(filters=[linode.GetInstanceTypesFilterArgs(
        name="vcpus",
        values=["2"],
    )])
    pulumi.export("typeIds", [__item.id for __item in specific_types.types])
    ```

    Get information about all Linode Instance types:

    ```python
    import pulumi
    import pulumi_linode as linode

    all_types = linode.get_instance_types()
    pulumi.export("typeIds", [__item.id for __item in all_types.types])
    ```
    ## Filterable Fields

    * `class`

    * `disk`

    * `gpus`

    * `label`

    * `memory`

    * `network_out`

    * `transfer`

    * `vcpus`


    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['order'] = order
    __args__['orderBy'] = order_by
    __args__['types'] = types
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getInstanceTypes:getInstanceTypes', __args__, opts=opts, typ=GetInstanceTypesResult).value

    return AwaitableGetInstanceTypesResult(
        filters=__ret__.filters,
        id=__ret__.id,
        order=__ret__.order,
        order_by=__ret__.order_by,
        types=__ret__.types)


@_utilities.lift_output_func(get_instance_types)
def get_instance_types_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetInstanceTypesFilterArgs']]]]] = None,
                              order: Optional[pulumi.Input[Optional[str]]] = None,
                              order_by: Optional[pulumi.Input[Optional[str]]] = None,
                              types: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetInstanceTypesTypeArgs']]]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInstanceTypesResult]:
    """
    Provides information about Linode Instance types that match a set of filters.

    ## Example Usage

    Get information about all Linode Instance types with a certain number of VCPUs:

    ```python
    import pulumi
    import pulumi_linode as linode

    specific_types = linode.get_instance_types(filters=[linode.GetInstanceTypesFilterArgs(
        name="vcpus",
        values=["2"],
    )])
    pulumi.export("typeIds", [__item.id for __item in specific_types.types])
    ```

    Get information about all Linode Instance types:

    ```python
    import pulumi
    import pulumi_linode as linode

    all_types = linode.get_instance_types()
    pulumi.export("typeIds", [__item.id for __item in all_types.types])
    ```
    ## Filterable Fields

    * `class`

    * `disk`

    * `gpus`

    * `label`

    * `memory`

    * `network_out`

    * `transfer`

    * `vcpus`


    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    ...
