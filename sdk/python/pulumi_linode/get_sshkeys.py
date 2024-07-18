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
    'GetSshkeysResult',
    'AwaitableGetSshkeysResult',
    'get_sshkeys',
    'get_sshkeys_output',
]

@pulumi.output_type
class GetSshkeysResult:
    """
    A collection of values returned by getSshkeys.
    """
    def __init__(__self__, filters=None, id=None, order=None, order_by=None, sshkeys=None):
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
        if sshkeys and not isinstance(sshkeys, list):
            raise TypeError("Expected argument 'sshkeys' to be a list")
        pulumi.set(__self__, "sshkeys", sshkeys)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetSshkeysFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the SSH Key.
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
    def sshkeys(self) -> Optional[Sequence['outputs.GetSshkeysSshkeyResult']]:
        return pulumi.get(self, "sshkeys")


class AwaitableGetSshkeysResult(GetSshkeysResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSshkeysResult(
            filters=self.filters,
            id=self.id,
            order=self.order,
            order_by=self.order_by,
            sshkeys=self.sshkeys)


def get_sshkeys(filters: Optional[Sequence[pulumi.InputType['GetSshkeysFilterArgs']]] = None,
                order: Optional[str] = None,
                order_by: Optional[str] = None,
                sshkeys: Optional[Sequence[pulumi.InputType['GetSshkeysSshkeyArgs']]] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSshkeysResult:
    """
    `SshKey` provides access to a filtered list of SSH Keys in the Profile of the User identified by the access token.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ssh-keys).

    ## Example Usage

    The following example shows how the resource might be used to obtain the names of the SSH Keys configured on the Linode user profile.

    The following example shows how one might use this data source to access information about a Linode Kernel.

    ```python
    import pulumi
    import pulumi_linode as linode

    filtered_ssh = linode.get_sshkeys(filters=[
        linode.GetSshkeysFilterArgs(
            name="label",
            values=["my-ssh"],
        ),
        linode.GetSshkeysFilterArgs(
            name="ssh_key",
            values=["RSA-6522525"],
        ),
    ])
    ```

    ## Filterable Fields

    * `id`

    * `label`

    * `ssh_key`


    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['order'] = order
    __args__['orderBy'] = order_by
    __args__['sshkeys'] = sshkeys
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getSshkeys:getSshkeys', __args__, opts=opts, typ=GetSshkeysResult).value

    return AwaitableGetSshkeysResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        order=pulumi.get(__ret__, 'order'),
        order_by=pulumi.get(__ret__, 'order_by'),
        sshkeys=pulumi.get(__ret__, 'sshkeys'))


@_utilities.lift_output_func(get_sshkeys)
def get_sshkeys_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetSshkeysFilterArgs']]]]] = None,
                       order: Optional[pulumi.Input[Optional[str]]] = None,
                       order_by: Optional[pulumi.Input[Optional[str]]] = None,
                       sshkeys: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetSshkeysSshkeyArgs']]]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSshkeysResult]:
    """
    `SshKey` provides access to a filtered list of SSH Keys in the Profile of the User identified by the access token.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ssh-keys).

    ## Example Usage

    The following example shows how the resource might be used to obtain the names of the SSH Keys configured on the Linode user profile.

    The following example shows how one might use this data source to access information about a Linode Kernel.

    ```python
    import pulumi
    import pulumi_linode as linode

    filtered_ssh = linode.get_sshkeys(filters=[
        linode.GetSshkeysFilterArgs(
            name="label",
            values=["my-ssh"],
        ),
        linode.GetSshkeysFilterArgs(
            name="ssh_key",
            values=["RSA-6522525"],
        ),
    ])
    ```

    ## Filterable Fields

    * `id`

    * `label`

    * `ssh_key`


    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    ...
