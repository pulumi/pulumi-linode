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
    'GetUsersResult',
    'AwaitableGetUsersResult',
    'get_users',
    'get_users_output',
]

@pulumi.output_type
class GetUsersResult:
    """
    A collection of values returned by getUsers.
    """
    def __init__(__self__, filters=None, id=None, order=None, order_by=None, users=None):
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
        if users and not isinstance(users, list):
            raise TypeError("Expected argument 'users' to be a list")
        pulumi.set(__self__, "users", users)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetUsersFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of entity this grant applies to.
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
    def users(self) -> Optional[Sequence['outputs.GetUsersUserResult']]:
        return pulumi.get(self, "users")


class AwaitableGetUsersResult(GetUsersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUsersResult(
            filters=self.filters,
            id=self.id,
            order=self.order,
            order_by=self.order_by,
            users=self.users)


def get_users(filters: Optional[Sequence[pulumi.InputType['GetUsersFilterArgs']]] = None,
              order: Optional[str] = None,
              order_by: Optional[str] = None,
              users: Optional[Sequence[pulumi.InputType['GetUsersUserArgs']]] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUsersResult:
    """
    Provides information about Linode users that match a set of filters.

    ```python
    import pulumi
    import pulumi_linode as linode

    filtered_users = linode.get_users(filters=[linode.GetUsersFilterArgs(
        name="username",
        values=["test-user"],
    )])
    pulumi.export("users", filtered_users.users)
    ```

    ## Filterable Fields

    * `username`

    * `email`

    * `restricted`

    * `password_created`

    * `tfa_enabled`

    * `verfied_phone_number`


    :param Sequence[pulumi.InputType['GetUsersFilterArgs']] filters: `filter` - (Optional) A set of filters used to select Linode users that meet certain requirements.
    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['order'] = order
    __args__['orderBy'] = order_by
    __args__['users'] = users
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getUsers:getUsers', __args__, opts=opts, typ=GetUsersResult).value

    return AwaitableGetUsersResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        order=pulumi.get(__ret__, 'order'),
        order_by=pulumi.get(__ret__, 'order_by'),
        users=pulumi.get(__ret__, 'users'))


@_utilities.lift_output_func(get_users)
def get_users_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetUsersFilterArgs']]]]] = None,
                     order: Optional[pulumi.Input[Optional[str]]] = None,
                     order_by: Optional[pulumi.Input[Optional[str]]] = None,
                     users: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetUsersUserArgs']]]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetUsersResult]:
    """
    Provides information about Linode users that match a set of filters.

    ```python
    import pulumi
    import pulumi_linode as linode

    filtered_users = linode.get_users(filters=[linode.GetUsersFilterArgs(
        name="username",
        values=["test-user"],
    )])
    pulumi.export("users", filtered_users.users)
    ```

    ## Filterable Fields

    * `username`

    * `email`

    * `restricted`

    * `password_created`

    * `tfa_enabled`

    * `verfied_phone_number`


    :param Sequence[pulumi.InputType['GetUsersFilterArgs']] filters: `filter` - (Optional) A set of filters used to select Linode users that meet certain requirements.
    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    ...
