# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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
    'GetDatabasesResult',
    'AwaitableGetDatabasesResult',
    'get_databases',
    'get_databases_output',
]

@pulumi.output_type
class GetDatabasesResult:
    """
    A collection of values returned by getDatabases.
    """
    def __init__(__self__, databases=None, filters=None, id=None, order=None, order_by=None):
        if databases and not isinstance(databases, list):
            raise TypeError("Expected argument 'databases' to be a list")
        pulumi.set(__self__, "databases", databases)
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

    @property
    @pulumi.getter
    def databases(self) -> Optional[Sequence['outputs.GetDatabasesDatabaseResult']]:
        return pulumi.get(self, "databases")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetDatabasesFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The ID of the Managed Database.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def order(self) -> Optional[builtins.str]:
        return pulumi.get(self, "order")

    @property
    @pulumi.getter(name="orderBy")
    def order_by(self) -> Optional[builtins.str]:
        return pulumi.get(self, "order_by")


class AwaitableGetDatabasesResult(GetDatabasesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatabasesResult(
            databases=self.databases,
            filters=self.filters,
            id=self.id,
            order=self.order,
            order_by=self.order_by)


def get_databases(databases: Optional[Sequence[Union['GetDatabasesDatabaseArgs', 'GetDatabasesDatabaseArgsDict']]] = None,
                  filters: Optional[Sequence[Union['GetDatabasesFilterArgs', 'GetDatabasesFilterArgsDict']]] = None,
                  order: Optional[builtins.str] = None,
                  order_by: Optional[builtins.str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatabasesResult:
    """
    Provides information about Linode Managed Databases that match a set of filters.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-databases-instances).

    ## Example Usage

    Get information about all Linode Managed Databases:

    ```python
    import pulumi
    import pulumi_linode as linode

    all = linode.get_databases()
    pulumi.export("databaseIds", [__item.id for __item in all.databases])
    ```

    Get information about all Linode MySQL Databases:

    ```python
    import pulumi
    import pulumi_linode as linode

    mysql = linode.get_databases(filters=[{
        "name": "engine",
        "values": ["mysql"],
    }])
    pulumi.export("databaseIds", [__item.id for __item in mysql.databases])
    ```


    :param builtins.str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param builtins.str order_by: The attribute to order the results by. (`version`)
    """
    __args__ = dict()
    __args__['databases'] = databases
    __args__['filters'] = filters
    __args__['order'] = order
    __args__['orderBy'] = order_by
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getDatabases:getDatabases', __args__, opts=opts, typ=GetDatabasesResult).value

    return AwaitableGetDatabasesResult(
        databases=pulumi.get(__ret__, 'databases'),
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        order=pulumi.get(__ret__, 'order'),
        order_by=pulumi.get(__ret__, 'order_by'))
def get_databases_output(databases: Optional[pulumi.Input[Optional[Sequence[Union['GetDatabasesDatabaseArgs', 'GetDatabasesDatabaseArgsDict']]]]] = None,
                         filters: Optional[pulumi.Input[Optional[Sequence[Union['GetDatabasesFilterArgs', 'GetDatabasesFilterArgsDict']]]]] = None,
                         order: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                         order_by: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDatabasesResult]:
    """
    Provides information about Linode Managed Databases that match a set of filters.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-databases-instances).

    ## Example Usage

    Get information about all Linode Managed Databases:

    ```python
    import pulumi
    import pulumi_linode as linode

    all = linode.get_databases()
    pulumi.export("databaseIds", [__item.id for __item in all.databases])
    ```

    Get information about all Linode MySQL Databases:

    ```python
    import pulumi
    import pulumi_linode as linode

    mysql = linode.get_databases(filters=[{
        "name": "engine",
        "values": ["mysql"],
    }])
    pulumi.export("databaseIds", [__item.id for __item in mysql.databases])
    ```


    :param builtins.str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param builtins.str order_by: The attribute to order the results by. (`version`)
    """
    __args__ = dict()
    __args__['databases'] = databases
    __args__['filters'] = filters
    __args__['order'] = order
    __args__['orderBy'] = order_by
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('linode:index/getDatabases:getDatabases', __args__, opts=opts, typ=GetDatabasesResult)
    return __ret__.apply(lambda __response__: GetDatabasesResult(
        databases=pulumi.get(__response__, 'databases'),
        filters=pulumi.get(__response__, 'filters'),
        id=pulumi.get(__response__, 'id'),
        order=pulumi.get(__response__, 'order'),
        order_by=pulumi.get(__response__, 'order_by')))
