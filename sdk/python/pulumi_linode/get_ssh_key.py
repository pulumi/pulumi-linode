# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class GetSshKeyResult:
    """
    A collection of values returned by getSshKey.
    """
    def __init__(__self__, created=None, label=None, ssh_key=None, id=None):
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        __self__.created = created
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        __self__.label = label
        if ssh_key and not isinstance(ssh_key, str):
            raise TypeError("Expected argument 'ssh_key' to be a str")
        __self__.ssh_key = ssh_key
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """

async def get_ssh_key(label=None,opts=None):
    """
    `linode_sshkey` provides access to a specifically labeled SSH Key in the Profile of the User identified by the access token.
    """
    __args__ = dict()

    __args__['label'] = label
    __ret__ = await pulumi.runtime.invoke('linode:index/getSshKey:getSshKey', __args__, opts=opts)

    return GetSshKeyResult(
        created=__ret__.get('created'),
        label=__ret__.get('label'),
        ssh_key=__ret__.get('sshKey'),
        id=__ret__.get('id'))
