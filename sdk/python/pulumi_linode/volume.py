# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['Volume']


class Volume(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 linode_id: Optional[pulumi.Input[int]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Linode Volume resource.  This can be used to create, modify, and delete Linodes Block Storage Volumes.  Block Storage Volumes are removable storage disks that persist outside the life-cycle of Linode Instances. These volumes can be attached to and detached from Linode instances throughout a region.

        For more information, see [How to Use Block Storage with Your Linode](https://www.linode.com/docs/platform/block-storage/how-to-use-block-storage-with-your-linode/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createVolume).

        ## Example Usage

        The following example shows how one might use this resource to configure a Block Storage Volume attached to a Linode Instance.

        ```python
        import pulumi
        import pulumi_linode as linode

        foobaz = linode.Instance("foobaz",
            region="us-west",
            root_pass="3X4mp13",
            tags=["foobaz"],
            type="g6-nanode-1")
        foobar = linode.Volume("foobar",
            label="foo-volume",
            linode_id=foobaz.id,
            region=foobaz.region)
        ```

        Volumes can also be attached using the Linode Instance config device map.

        ```python
        import pulumi
        import pulumi_linode as linode

        foo = linode.Instance("foo",
            configs=[linode.InstanceConfigArgs(
                devices=linode.InstanceConfigDevicesArgs(
                    sda=linode.InstanceConfigDevicesSdaArgs(
                        volume_id=123,
                    ),
                ),
                kernel="linode/latest-64bit",
                label="boot-existing-volume",
            )],
            region="us-east",
            type="g6-nanode-1")
        ```
        ## Attributes

        This resource exports the following attributes:

        * `status` - The label of the Linode Volume.

        * `filesystem_path` - The full filesystem path for the Volume based on the Volume's label. The path is "/dev/disk/by-id/scsi-0Linode_Volume_" + the Volume label

        ## Import

        Linodes Volumes can be imported using the Linode Volume `id`, e.g.

        ```sh
         $ pulumi import linode:index/volume:Volume myvolume 1234567
        ```

         The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for Block Storage Volumes and other Linode resource types.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] label: The label of the Linode Volume
        :param pulumi.Input[int] linode_id: The ID of a Linode Instance where the Volume should be attached.
        :param pulumi.Input[str] region: The region where this volume will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode Volume.*.
        :param pulumi.Input[int] size: Size of the Volume in GB.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tags applied to this object. Tags are for organizational purposes only.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if label is None:
                raise TypeError("Missing required property 'label'")
            __props__['label'] = label
            __props__['linode_id'] = linode_id
            if region is None:
                raise TypeError("Missing required property 'region'")
            __props__['region'] = region
            __props__['size'] = size
            __props__['tags'] = tags
            __props__['filesystem_path'] = None
            __props__['status'] = None
        super(Volume, __self__).__init__(
            'linode:index/volume:Volume',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            filesystem_path: Optional[pulumi.Input[str]] = None,
            label: Optional[pulumi.Input[str]] = None,
            linode_id: Optional[pulumi.Input[int]] = None,
            region: Optional[pulumi.Input[str]] = None,
            size: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'Volume':
        """
        Get an existing Volume resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] filesystem_path: The full filesystem path for the Volume based on the Volume's label. Path is /dev/disk/by-id/scsi-0Linode_Volume_ +
               Volume label.
        :param pulumi.Input[str] label: The label of the Linode Volume
        :param pulumi.Input[int] linode_id: The ID of a Linode Instance where the Volume should be attached.
        :param pulumi.Input[str] region: The region where this volume will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode Volume.*.
        :param pulumi.Input[int] size: Size of the Volume in GB.
        :param pulumi.Input[str] status: The status of the volume, indicating the current readiness state.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tags applied to this object. Tags are for organizational purposes only.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["filesystem_path"] = filesystem_path
        __props__["label"] = label
        __props__["linode_id"] = linode_id
        __props__["region"] = region
        __props__["size"] = size
        __props__["status"] = status
        __props__["tags"] = tags
        return Volume(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="filesystemPath")
    def filesystem_path(self) -> pulumi.Output[str]:
        """
        The full filesystem path for the Volume based on the Volume's label. Path is /dev/disk/by-id/scsi-0Linode_Volume_ +
        Volume label.
        """
        return pulumi.get(self, "filesystem_path")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[str]:
        """
        The label of the Linode Volume
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> pulumi.Output[int]:
        """
        The ID of a Linode Instance where the Volume should be attached.
        """
        return pulumi.get(self, "linode_id")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The region where this volume will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode Volume.*.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def size(self) -> pulumi.Output[int]:
        """
        Size of the Volume in GB.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the volume, indicating the current readiness state.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of tags applied to this object. Tags are for organizational purposes only.
        """
        return pulumi.get(self, "tags")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

