# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAccountLoginResult',
    'AwaitableGetAccountLoginResult',
    'get_account_login',
    'get_account_login_output',
]

@pulumi.output_type
class GetAccountLoginResult:
    """
    A collection of values returned by getAccountLogin.
    """
    def __init__(__self__, datetime=None, id=None, ip=None, restricted=None, status=None, username=None):
        if datetime and not isinstance(datetime, str):
            raise TypeError("Expected argument 'datetime' to be a str")
        pulumi.set(__self__, "datetime", datetime)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if ip and not isinstance(ip, str):
            raise TypeError("Expected argument 'ip' to be a str")
        pulumi.set(__self__, "ip", ip)
        if restricted and not isinstance(restricted, bool):
            raise TypeError("Expected argument 'restricted' to be a bool")
        pulumi.set(__self__, "restricted", restricted)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def datetime(self) -> str:
        """
        When the login was initiated.
        """
        return pulumi.get(self, "datetime")

    @property
    @pulumi.getter
    def id(self) -> int:
        """
        The unique ID of this login object.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ip(self) -> str:
        """
        The remote IP address that requested the login.
        """
        return pulumi.get(self, "ip")

    @property
    @pulumi.getter
    def restricted(self) -> bool:
        """
        True if the User that was logged into was a restricted User, false otherwise.
        """
        return pulumi.get(self, "restricted")

    @property
    @pulumi.getter
    def status(self) -> str:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def username(self) -> str:
        """
        The username of the User that was logged into.
        """
        return pulumi.get(self, "username")


class AwaitableGetAccountLoginResult(GetAccountLoginResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountLoginResult(
            datetime=self.datetime,
            id=self.id,
            ip=self.ip,
            restricted=self.restricted,
            status=self.status,
            username=self.username)


def get_account_login(id: Optional[int] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccountLoginResult:
    """
    Provides details about a specific Linode account login.


    :param int id: The unique ID of this login object.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getAccountLogin:getAccountLogin', __args__, opts=opts, typ=GetAccountLoginResult).value

    return AwaitableGetAccountLoginResult(
        datetime=pulumi.get(__ret__, 'datetime'),
        id=pulumi.get(__ret__, 'id'),
        ip=pulumi.get(__ret__, 'ip'),
        restricted=pulumi.get(__ret__, 'restricted'),
        status=pulumi.get(__ret__, 'status'),
        username=pulumi.get(__ret__, 'username'))


@_utilities.lift_output_func(get_account_login)
def get_account_login_output(id: Optional[pulumi.Input[int]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccountLoginResult]:
    """
    Provides details about a specific Linode account login.


    :param int id: The unique ID of this login object.
    """
    ...
