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
    'GetKernelsResult',
    'AwaitableGetKernelsResult',
    'get_kernels',
    'get_kernels_output',
]

@pulumi.output_type
class GetKernelsResult:
    """
    A collection of values returned by getKernels.
    """
    def __init__(__self__, filters=None, id=None, kernels=None, order=None, order_by=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if kernels and not isinstance(kernels, list):
            raise TypeError("Expected argument 'kernels' to be a list")
        pulumi.set(__self__, "kernels", kernels)
        if order and not isinstance(order, str):
            raise TypeError("Expected argument 'order' to be a str")
        pulumi.set(__self__, "order", order)
        if order_by and not isinstance(order_by, str):
            raise TypeError("Expected argument 'order_by' to be a str")
        pulumi.set(__self__, "order_by", order_by)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetKernelsFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The unique ID of this Kernel.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def kernels(self) -> Optional[Sequence['outputs.GetKernelsKernelResult']]:
        return pulumi.get(self, "kernels")

    @property
    @pulumi.getter
    def order(self) -> Optional[str]:
        return pulumi.get(self, "order")

    @property
    @pulumi.getter(name="orderBy")
    def order_by(self) -> Optional[str]:
        return pulumi.get(self, "order_by")


class AwaitableGetKernelsResult(GetKernelsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKernelsResult(
            filters=self.filters,
            id=self.id,
            kernels=self.kernels,
            order=self.order,
            order_by=self.order_by)


def get_kernels(filters: Optional[Sequence[Union['GetKernelsFilterArgs', 'GetKernelsFilterArgsDict']]] = None,
                kernels: Optional[Sequence[Union['GetKernelsKernelArgs', 'GetKernelsKernelArgsDict']]] = None,
                order: Optional[str] = None,
                order_by: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKernelsResult:
    """
    Provides information about Linode Kernels that match a set of filters.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-kernels).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode Kernel.

    ```python
    import pulumi
    import pulumi_linode as linode

    filtered_kernels = linode.get_kernels(filters=[
        {
            "name": "label",
            "values": ["my-kernel"],
        },
        {
            "name": "architecture",
            "values": ["x86_64"],
        },
    ])
    ```

    ## Filterable Fields

    * `id`

    * `architecture`

    * `deprecated`

    * `kvm`

    * `label`

    * `pvops`

    * `version`

    * `xen`


    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['kernels'] = kernels
    __args__['order'] = order
    __args__['orderBy'] = order_by
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getKernels:getKernels', __args__, opts=opts, typ=GetKernelsResult).value

    return AwaitableGetKernelsResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        kernels=pulumi.get(__ret__, 'kernels'),
        order=pulumi.get(__ret__, 'order'),
        order_by=pulumi.get(__ret__, 'order_by'))


@_utilities.lift_output_func(get_kernels)
def get_kernels_output(filters: Optional[pulumi.Input[Optional[Sequence[Union['GetKernelsFilterArgs', 'GetKernelsFilterArgsDict']]]]] = None,
                       kernels: Optional[pulumi.Input[Optional[Sequence[Union['GetKernelsKernelArgs', 'GetKernelsKernelArgsDict']]]]] = None,
                       order: Optional[pulumi.Input[Optional[str]]] = None,
                       order_by: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetKernelsResult]:
    """
    Provides information about Linode Kernels that match a set of filters.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-kernels).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode Kernel.

    ```python
    import pulumi
    import pulumi_linode as linode

    filtered_kernels = linode.get_kernels(filters=[
        {
            "name": "label",
            "values": ["my-kernel"],
        },
        {
            "name": "architecture",
            "values": ["x86_64"],
        },
    ])
    ```

    ## Filterable Fields

    * `id`

    * `architecture`

    * `deprecated`

    * `kvm`

    * `label`

    * `pvops`

    * `version`

    * `xen`


    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    ...
