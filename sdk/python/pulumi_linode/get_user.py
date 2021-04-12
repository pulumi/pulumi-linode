# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables

__all__ = [
    'GetUserResult',
    'AwaitableGetUserResult',
    'get_user',
]

@pulumi.output_type
class GetUserResult:
    """
    A collection of values returned by getUser.
    """
    def __init__(__self__, email=None, id=None, restricted=None, ssh_keys=None, username=None):
        if email and not isinstance(email, str):
            raise TypeError("Expected argument 'email' to be a str")
        pulumi.set(__self__, "email", email)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if restricted and not isinstance(restricted, bool):
            raise TypeError("Expected argument 'restricted' to be a bool")
        pulumi.set(__self__, "restricted", restricted)
        if ssh_keys and not isinstance(ssh_keys, list):
            raise TypeError("Expected argument 'ssh_keys' to be a list")
        pulumi.set(__self__, "ssh_keys", ssh_keys)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def email(self) -> str:
        return pulumi.get(self, "email")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def restricted(self) -> bool:
        return pulumi.get(self, "restricted")

    @property
    @pulumi.getter(name="sshKeys")
    def ssh_keys(self) -> Sequence[str]:
        return pulumi.get(self, "ssh_keys")

    @property
    @pulumi.getter
    def username(self) -> str:
        return pulumi.get(self, "username")


class AwaitableGetUserResult(GetUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserResult(
            email=self.email,
            id=self.id,
            restricted=self.restricted,
            ssh_keys=self.ssh_keys,
            username=self.username)


def get_user(username: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserResult:
    """
    Provides information about a Linode user

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode user.

    ```python
    import pulumi
    import pulumi_linode as linode

    foo = linode.get_user(username="foo")
    ```
    ## Attributes

    The Linode User resource exports the following attributes:

    * `ssh_keys` - A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorized_users field of a create Linode, rebuild Linode, or create Disk request.

    * `email` - The email address for this User, for account management communications, and may be used for other communications as configured.

    * `restricted` - If true, this User must be granted access to perform actions or access entities on this Account.


    :param str username: The unique username of this User.
    """
    __args__ = dict()
    __args__['username'] = username
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('linode:index/getUser:getUser', __args__, opts=opts, typ=GetUserResult).value

    return AwaitableGetUserResult(
        email=__ret__.email,
        id=__ret__.id,
        restricted=__ret__.restricted,
        ssh_keys=__ret__.ssh_keys,
        username=__ret__.username)
