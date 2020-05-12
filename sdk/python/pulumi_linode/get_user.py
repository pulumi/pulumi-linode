# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetUserResult:
    """
    A collection of values returned by getUser.
    """
    def __init__(__self__, email=None, id=None, restricted=None, ssh_keys=None, username=None):
        if email and not isinstance(email, str):
            raise TypeError("Expected argument 'email' to be a str")
        __self__.email = email
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if restricted and not isinstance(restricted, bool):
            raise TypeError("Expected argument 'restricted' to be a bool")
        __self__.restricted = restricted
        if ssh_keys and not isinstance(ssh_keys, list):
            raise TypeError("Expected argument 'ssh_keys' to be a list")
        __self__.ssh_keys = ssh_keys
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        __self__.username = username
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

def get_user(username=None,opts=None):
    """
    Provides information about a Linode user

    ## Example Usage



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
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('linode:index/getUser:getUser', __args__, opts=opts).value

    return AwaitableGetUserResult(
        email=__ret__.get('email'),
        id=__ret__.get('id'),
        restricted=__ret__.get('restricted'),
        ssh_keys=__ret__.get('sshKeys'),
        username=__ret__.get('username'))
