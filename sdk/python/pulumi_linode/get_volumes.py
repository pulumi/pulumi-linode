# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
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
    'GetVolumesResult',
    'AwaitableGetVolumesResult',
    'get_volumes',
    'get_volumes_output',
]

@pulumi.output_type
class GetVolumesResult:
    """
    A collection of values returned by getVolumes.
    """
    def __init__(__self__, filters=None, id=None, order=None, order_by=None, volumes=None):
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
        if volumes and not isinstance(volumes, list):
            raise TypeError("Expected argument 'volumes' to be a list")
        pulumi.set(__self__, "volumes", volumes)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetVolumesFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The unique ID of this Volume.
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
    def volumes(self) -> Optional[Sequence['outputs.GetVolumesVolumeResult']]:
        return pulumi.get(self, "volumes")


class AwaitableGetVolumesResult(GetVolumesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVolumesResult(
            filters=self.filters,
            id=self.id,
            order=self.order,
            order_by=self.order_by,
            volumes=self.volumes)


def get_volumes(filters: Optional[Sequence[Union['GetVolumesFilterArgs', 'GetVolumesFilterArgsDict']]] = None,
                order: Optional[str] = None,
                order_by: Optional[str] = None,
                volumes: Optional[Sequence[Union['GetVolumesVolumeArgs', 'GetVolumesVolumeArgsDict']]] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVolumesResult:
    """
    Provides information about Linode volumes that match a set of filters.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-volumes).

    ```python
    import pulumi
    import pulumi_linode as linode

    filtered_volumes = linode.get_volumes(filters=[{
        "name": "label",
        "values": ["test-volume"],
    }])
    pulumi.export("volumes", filtered_volumes.volumes)
    ```

    ## Filterable Fields

    * `label`

    * `tags`


    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['order'] = order
    __args__['orderBy'] = order_by
    __args__['volumes'] = volumes
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getVolumes:getVolumes', __args__, opts=opts, typ=GetVolumesResult).value

    return AwaitableGetVolumesResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        order=pulumi.get(__ret__, 'order'),
        order_by=pulumi.get(__ret__, 'order_by'),
        volumes=pulumi.get(__ret__, 'volumes'))
def get_volumes_output(filters: Optional[pulumi.Input[Optional[Sequence[Union['GetVolumesFilterArgs', 'GetVolumesFilterArgsDict']]]]] = None,
                       order: Optional[pulumi.Input[Optional[str]]] = None,
                       order_by: Optional[pulumi.Input[Optional[str]]] = None,
                       volumes: Optional[pulumi.Input[Optional[Sequence[Union['GetVolumesVolumeArgs', 'GetVolumesVolumeArgsDict']]]]] = None,
                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetVolumesResult]:
    """
    Provides information about Linode volumes that match a set of filters.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-volumes).

    ```python
    import pulumi
    import pulumi_linode as linode

    filtered_volumes = linode.get_volumes(filters=[{
        "name": "label",
        "values": ["test-volume"],
    }])
    pulumi.export("volumes", filtered_volumes.volumes)
    ```

    ## Filterable Fields

    * `label`

    * `tags`


    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['order'] = order
    __args__['orderBy'] = order_by
    __args__['volumes'] = volumes
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('linode:index/getVolumes:getVolumes', __args__, opts=opts, typ=GetVolumesResult)
    return __ret__.apply(lambda __response__: GetVolumesResult(
        filters=pulumi.get(__response__, 'filters'),
        id=pulumi.get(__response__, 'id'),
        order=pulumi.get(__response__, 'order'),
        order_by=pulumi.get(__response__, 'order_by'),
        volumes=pulumi.get(__response__, 'volumes')))
