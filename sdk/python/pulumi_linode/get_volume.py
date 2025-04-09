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

__all__ = [
    'GetVolumeResult',
    'AwaitableGetVolumeResult',
    'get_volume',
    'get_volume_output',
]

@pulumi.output_type
class GetVolumeResult:
    """
    A collection of values returned by getVolume.
    """
    def __init__(__self__, created=None, encryption=None, filesystem_path=None, id=None, label=None, linode_id=None, region=None, size=None, status=None, tags=None, updated=None):
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
        if encryption and not isinstance(encryption, str):
            raise TypeError("Expected argument 'encryption' to be a str")
        pulumi.set(__self__, "encryption", encryption)
        if filesystem_path and not isinstance(filesystem_path, str):
            raise TypeError("Expected argument 'filesystem_path' to be a str")
        pulumi.set(__self__, "filesystem_path", filesystem_path)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if linode_id and not isinstance(linode_id, int):
            raise TypeError("Expected argument 'linode_id' to be a int")
        pulumi.set(__self__, "linode_id", linode_id)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if size and not isinstance(size, int):
            raise TypeError("Expected argument 'size' to be a int")
        pulumi.set(__self__, "size", size)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if updated and not isinstance(updated, str):
            raise TypeError("Expected argument 'updated' to be a str")
        pulumi.set(__self__, "updated", updated)

    @property
    @pulumi.getter
    def created(self) -> builtins.str:
        """
        When this Volume was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def encryption(self) -> builtins.str:
        """
        Whether Block Storage Disk Encryption is enabled or disabled on this Volume. Note: Block Storage Disk Encryption is not currently available to all users.
        """
        return pulumi.get(self, "encryption")

    @property
    @pulumi.getter(name="filesystemPath")
    def filesystem_path(self) -> builtins.str:
        """
        The full filesystem path for the Volume based on the Volume's label. Path is /dev/disk/by-id/scsi-0LinodeVolume + Volume label.
        """
        return pulumi.get(self, "filesystem_path")

    @property
    @pulumi.getter
    def id(self) -> builtins.int:
        """
        The unique ID of this Volume.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def label(self) -> builtins.str:
        """
        This Volume's label is for display purposes only.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> builtins.int:
        """
        If a Volume is attached to a specific Linode, the ID of that Linode will be displayed here. If the Volume is unattached, this value will be null.
        """
        return pulumi.get(self, "linode_id")

    @property
    @pulumi.getter
    def region(self) -> builtins.str:
        """
        The datacenter in which this Volume is located. See all regions [here](https://api.linode.com/v4/regions).
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def size(self) -> builtins.int:
        """
        The Volume's size, in GiB.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter
    def status(self) -> builtins.str:
        """
        The current status of the Volume. (`creating`, `active`, `resizing`, `contact_support`)
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[builtins.str]:
        """
        An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def updated(self) -> builtins.str:
        """
        When this Volume was last updated.
        """
        return pulumi.get(self, "updated")


class AwaitableGetVolumeResult(GetVolumeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVolumeResult(
            created=self.created,
            encryption=self.encryption,
            filesystem_path=self.filesystem_path,
            id=self.id,
            label=self.label,
            linode_id=self.linode_id,
            region=self.region,
            size=self.size,
            status=self.status,
            tags=self.tags,
            updated=self.updated)


def get_volume(id: Optional[builtins.int] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVolumeResult:
    """
    Provides information about a Linode Volume.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-volume).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode Volume.

    ```python
    import pulumi
    import pulumi_linode as linode

    foo = linode.get_volume(id=1234567)
    ```


    :param builtins.int id: The unique numeric ID of the Volume record to query.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getVolume:getVolume', __args__, opts=opts, typ=GetVolumeResult).value

    return AwaitableGetVolumeResult(
        created=pulumi.get(__ret__, 'created'),
        encryption=pulumi.get(__ret__, 'encryption'),
        filesystem_path=pulumi.get(__ret__, 'filesystem_path'),
        id=pulumi.get(__ret__, 'id'),
        label=pulumi.get(__ret__, 'label'),
        linode_id=pulumi.get(__ret__, 'linode_id'),
        region=pulumi.get(__ret__, 'region'),
        size=pulumi.get(__ret__, 'size'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'),
        updated=pulumi.get(__ret__, 'updated'))
def get_volume_output(id: Optional[pulumi.Input[builtins.int]] = None,
                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetVolumeResult]:
    """
    Provides information about a Linode Volume.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-volume).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode Volume.

    ```python
    import pulumi
    import pulumi_linode as linode

    foo = linode.get_volume(id=1234567)
    ```


    :param builtins.int id: The unique numeric ID of the Volume record to query.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('linode:index/getVolume:getVolume', __args__, opts=opts, typ=GetVolumeResult)
    return __ret__.apply(lambda __response__: GetVolumeResult(
        created=pulumi.get(__response__, 'created'),
        encryption=pulumi.get(__response__, 'encryption'),
        filesystem_path=pulumi.get(__response__, 'filesystem_path'),
        id=pulumi.get(__response__, 'id'),
        label=pulumi.get(__response__, 'label'),
        linode_id=pulumi.get(__response__, 'linode_id'),
        region=pulumi.get(__response__, 'region'),
        size=pulumi.get(__response__, 'size'),
        status=pulumi.get(__response__, 'status'),
        tags=pulumi.get(__response__, 'tags'),
        updated=pulumi.get(__response__, 'updated')))
