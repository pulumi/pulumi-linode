# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetSshKeyResult:
    """
    A collection of values returned by getSshKey.
    """
    def __init__(__self__, created=None, id=None, label=None, ssh_key=None):
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        __self__.created = created
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        __self__.label = label
        if ssh_key and not isinstance(ssh_key, str):
            raise TypeError("Expected argument 'ssh_key' to be a str")
        __self__.ssh_key = ssh_key
class AwaitableGetSshKeyResult(GetSshKeyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSshKeyResult(
            created=self.created,
            id=self.id,
            label=self.label,
            ssh_key=self.ssh_key)

def get_ssh_key(label=None,opts=None):
    """
    `SshKey` provides access to a specifically labeled SSH Key in the Profile of the User identified by the access token.

    ## Example Usage

    The following example shows how the resource might be used to obtain the name of the SSH Key configured on the Linode user profile.

    ```python
    import pulumi
    import pulumi_linode as linode

    foo = linode.get_ssh_key(label="foo")
    ```
    """
    __args__ = dict()


    __args__['label'] = label
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('linode:index/getSshKey:getSshKey', __args__, opts=opts).value

    return AwaitableGetSshKeyResult(
        created=__ret__.get('created'),
        id=__ret__.get('id'),
        label=__ret__.get('label'),
        ssh_key=__ret__.get('sshKey'))
