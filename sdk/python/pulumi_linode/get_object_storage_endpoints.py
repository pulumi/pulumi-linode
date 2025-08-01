# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetObjectStorageEndpointsResult',
    'AwaitableGetObjectStorageEndpointsResult',
    'get_object_storage_endpoints',
    'get_object_storage_endpoints_output',
]

@pulumi.output_type
class GetObjectStorageEndpointsResult:
    """
    A collection of values returned by getObjectStorageEndpoints.
    """
    def __init__(__self__, endpoints=None, filters=None, id=None, order=None, order_by=None):
        if endpoints and not isinstance(endpoints, list):
            raise TypeError("Expected argument 'endpoints' to be a list")
        pulumi.set(__self__, "endpoints", endpoints)
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

    @_builtins.property
    @pulumi.getter
    def endpoints(self) -> Optional[Sequence['outputs.GetObjectStorageEndpointsEndpointResult']]:
        return pulumi.get(self, "endpoints")

    @_builtins.property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetObjectStorageEndpointsFilterResult']]:
        return pulumi.get(self, "filters")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def order(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "order")

    @_builtins.property
    @pulumi.getter(name="orderBy")
    def order_by(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "order_by")


class AwaitableGetObjectStorageEndpointsResult(GetObjectStorageEndpointsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetObjectStorageEndpointsResult(
            endpoints=self.endpoints,
            filters=self.filters,
            id=self.id,
            order=self.order,
            order_by=self.order_by)


def get_object_storage_endpoints(endpoints: Optional[Sequence[Union['GetObjectStorageEndpointsEndpointArgs', 'GetObjectStorageEndpointsEndpointArgsDict']]] = None,
                                 filters: Optional[Sequence[Union['GetObjectStorageEndpointsFilterArgs', 'GetObjectStorageEndpointsFilterArgsDict']]] = None,
                                 order: Optional[_builtins.str] = None,
                                 order_by: Optional[_builtins.str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetObjectStorageEndpointsResult:
    """
    Provides information about Linode Object Storage endpoints available to the user.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-object-storage-endpoints).

    ## Example Usage

    Get an endpoint of E3 type (highest performance and capacity) of Linode Object Storage services:

    ```python
    import pulumi
    import pulumi_linode as linode

    test = linode.get_object_storage_endpoints(filters=[{
        "name": "endpoint_type",
        "values": ["E3"],
    }])
    pulumi.export("high-performance-obj-endpoint", test.endpoints[0].s3_endpoint)
    ```

    Get a list of all available endpoints of Linode Object Storage services.

    ```python
    import pulumi
    import pulumi_linode as linode

    test = linode.get_object_storage_endpoints()
    pulumi.export("available-endpoints", test.endpoints)
    ```

    ## Filterable Fields

    * `endpoint_type`

    * `region`

    * `s3_endpoint`


    :param _builtins.str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param _builtins.str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    __args__ = dict()
    __args__['endpoints'] = endpoints
    __args__['filters'] = filters
    __args__['order'] = order
    __args__['orderBy'] = order_by
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getObjectStorageEndpoints:getObjectStorageEndpoints', __args__, opts=opts, typ=GetObjectStorageEndpointsResult).value

    return AwaitableGetObjectStorageEndpointsResult(
        endpoints=pulumi.get(__ret__, 'endpoints'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        order=pulumi.get(__ret__, 'order'),
        order_by=pulumi.get(__ret__, 'order_by'))
def get_object_storage_endpoints_output(endpoints: Optional[pulumi.Input[Optional[Sequence[Union['GetObjectStorageEndpointsEndpointArgs', 'GetObjectStorageEndpointsEndpointArgsDict']]]]] = None,
                                        filters: Optional[pulumi.Input[Optional[Sequence[Union['GetObjectStorageEndpointsFilterArgs', 'GetObjectStorageEndpointsFilterArgsDict']]]]] = None,
                                        order: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        order_by: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetObjectStorageEndpointsResult]:
    """
    Provides information about Linode Object Storage endpoints available to the user.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-object-storage-endpoints).

    ## Example Usage

    Get an endpoint of E3 type (highest performance and capacity) of Linode Object Storage services:

    ```python
    import pulumi
    import pulumi_linode as linode

    test = linode.get_object_storage_endpoints(filters=[{
        "name": "endpoint_type",
        "values": ["E3"],
    }])
    pulumi.export("high-performance-obj-endpoint", test.endpoints[0].s3_endpoint)
    ```

    Get a list of all available endpoints of Linode Object Storage services.

    ```python
    import pulumi
    import pulumi_linode as linode

    test = linode.get_object_storage_endpoints()
    pulumi.export("available-endpoints", test.endpoints)
    ```

    ## Filterable Fields

    * `endpoint_type`

    * `region`

    * `s3_endpoint`


    :param _builtins.str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param _builtins.str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    __args__ = dict()
    __args__['endpoints'] = endpoints
    __args__['filters'] = filters
    __args__['order'] = order
    __args__['orderBy'] = order_by
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('linode:index/getObjectStorageEndpoints:getObjectStorageEndpoints', __args__, opts=opts, typ=GetObjectStorageEndpointsResult)
    return __ret__.apply(lambda __response__: GetObjectStorageEndpointsResult(
        endpoints=pulumi.get(__response__, 'endpoints'),
        filters=pulumi.get(__response__, 'filters'),
        id=pulumi.get(__response__, 'id'),
        order=pulumi.get(__response__, 'order'),
        order_by=pulumi.get(__response__, 'order_by')))
