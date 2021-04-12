# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables

__all__ = ['ImageArgs', 'Image']

@pulumi.input_type
class ImageArgs:
    def __init__(__self__, *,
                 disk_id: pulumi.Input[int],
                 label: pulumi.Input[str],
                 linode_id: pulumi.Input[int],
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Image resource.
        :param pulumi.Input[int] disk_id: The ID of the Linode Disk that this Image will be created from.
        :param pulumi.Input[str] label: A short description of the Image. Labels cannot contain special characters.
        :param pulumi.Input[int] linode_id: The ID of the Linode that this Image will be created from.
        :param pulumi.Input[str] description: A detailed description of this Image.
        """
        pulumi.set(__self__, "disk_id", disk_id)
        pulumi.set(__self__, "label", label)
        pulumi.set(__self__, "linode_id", linode_id)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter(name="diskId")
    def disk_id(self) -> pulumi.Input[int]:
        """
        The ID of the Linode Disk that this Image will be created from.
        """
        return pulumi.get(self, "disk_id")

    @disk_id.setter
    def disk_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "disk_id", value)

    @property
    @pulumi.getter
    def label(self) -> pulumi.Input[str]:
        """
        A short description of the Image. Labels cannot contain special characters.
        """
        return pulumi.get(self, "label")

    @label.setter
    def label(self, value: pulumi.Input[str]):
        pulumi.set(self, "label", value)

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> pulumi.Input[int]:
        """
        The ID of the Linode that this Image will be created from.
        """
        return pulumi.get(self, "linode_id")

    @linode_id.setter
    def linode_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "linode_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A detailed description of this Image.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


class Image(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disk_id: Optional[pulumi.Input[int]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 linode_id: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Linode Image resource.  This can be used to create, modify, and delete Linodes Images.  Linode Images are snapshots of a Linode Instance Disk which can then be used to provision more Linode Instances.  Images can be used across regions.

        For more information, see [Linode's documentation on Images](https://www.linode.com/docs/platform/disk-images/linode-images/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createImage).

        ## Example Usage

        The following example shows how one might use this resource to create an Image from a Linode Instance Disk and then deploy a new Linode Instance in another region using that Image.

        ```python
        import pulumi
        import pulumi_linode as linode

        foo = linode.Instance("foo",
            region="us-central",
            type="g6-nanode-1")
        bar = linode.Image("bar",
            description="Image taken from foo",
            disk_id=foo.disks[0].id,
            label="foo-sda-image",
            linode_id=foo.id)
        bar_based = linode.Instance("barBased",
            image=bar.id,
            region="eu-west",
            type=foo.type)
        ```
        ## Attributes

        This resource exports the following attributes:

        * `id` - The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.

        * `created` - When this Image was created.

        * `created_by` - The name of the User who created this Image.

        * `deprecated` - Whether or not this Image is deprecated. Will only be True for deprecated public Images.

        * `is_public` - True if the Image is public.

        * `size` - The minimum size this Image needs to deploy. Size is in MB.

        * `type` - How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from a deleted Linode.

        * `expiry` - Only Images created automatically (from a deleted Linode; type=automatic) will expire.

        * `vendor` - The upstream distribution vendor. Nil for private Images.

        ## Import

        Linodes Images can be imported using the Linode Image `id`, e.g.

        ```sh
         $ pulumi import linode:index/image:Image myimage 1234567
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A detailed description of this Image.
        :param pulumi.Input[int] disk_id: The ID of the Linode Disk that this Image will be created from.
        :param pulumi.Input[str] label: A short description of the Image. Labels cannot contain special characters.
        :param pulumi.Input[int] linode_id: The ID of the Linode that this Image will be created from.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ImageArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Linode Image resource.  This can be used to create, modify, and delete Linodes Images.  Linode Images are snapshots of a Linode Instance Disk which can then be used to provision more Linode Instances.  Images can be used across regions.

        For more information, see [Linode's documentation on Images](https://www.linode.com/docs/platform/disk-images/linode-images/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createImage).

        ## Example Usage

        The following example shows how one might use this resource to create an Image from a Linode Instance Disk and then deploy a new Linode Instance in another region using that Image.

        ```python
        import pulumi
        import pulumi_linode as linode

        foo = linode.Instance("foo",
            region="us-central",
            type="g6-nanode-1")
        bar = linode.Image("bar",
            description="Image taken from foo",
            disk_id=foo.disks[0].id,
            label="foo-sda-image",
            linode_id=foo.id)
        bar_based = linode.Instance("barBased",
            image=bar.id,
            region="eu-west",
            type=foo.type)
        ```
        ## Attributes

        This resource exports the following attributes:

        * `id` - The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.

        * `created` - When this Image was created.

        * `created_by` - The name of the User who created this Image.

        * `deprecated` - Whether or not this Image is deprecated. Will only be True for deprecated public Images.

        * `is_public` - True if the Image is public.

        * `size` - The minimum size this Image needs to deploy. Size is in MB.

        * `type` - How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from a deleted Linode.

        * `expiry` - Only Images created automatically (from a deleted Linode; type=automatic) will expire.

        * `vendor` - The upstream distribution vendor. Nil for private Images.

        ## Import

        Linodes Images can be imported using the Linode Image `id`, e.g.

        ```sh
         $ pulumi import linode:index/image:Image myimage 1234567
        ```

        :param str resource_name: The name of the resource.
        :param ImageArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ImageArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disk_id: Optional[pulumi.Input[int]] = None,
                 label: Optional[pulumi.Input[str]] = None,
                 linode_id: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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

            __props__['description'] = description
            if disk_id is None and not opts.urn:
                raise TypeError("Missing required property 'disk_id'")
            __props__['disk_id'] = disk_id
            if label is None and not opts.urn:
                raise TypeError("Missing required property 'label'")
            __props__['label'] = label
            if linode_id is None and not opts.urn:
                raise TypeError("Missing required property 'linode_id'")
            __props__['linode_id'] = linode_id
            __props__['created'] = None
            __props__['created_by'] = None
            __props__['deprecated'] = None
            __props__['expiry'] = None
            __props__['is_public'] = None
            __props__['size'] = None
            __props__['type'] = None
            __props__['vendor'] = None
        super(Image, __self__).__init__(
            'linode:index/image:Image',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created: Optional[pulumi.Input[str]] = None,
            created_by: Optional[pulumi.Input[str]] = None,
            deprecated: Optional[pulumi.Input[bool]] = None,
            description: Optional[pulumi.Input[str]] = None,
            disk_id: Optional[pulumi.Input[int]] = None,
            expiry: Optional[pulumi.Input[str]] = None,
            is_public: Optional[pulumi.Input[bool]] = None,
            label: Optional[pulumi.Input[str]] = None,
            linode_id: Optional[pulumi.Input[int]] = None,
            size: Optional[pulumi.Input[int]] = None,
            type: Optional[pulumi.Input[str]] = None,
            vendor: Optional[pulumi.Input[str]] = None) -> 'Image':
        """
        Get an existing Image resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created: When this Image was created.
        :param pulumi.Input[str] created_by: The name of the User who created this Image.
        :param pulumi.Input[bool] deprecated: Whether or not this Image is deprecated. Will only be True for deprecated public Images.
        :param pulumi.Input[str] description: A detailed description of this Image.
        :param pulumi.Input[int] disk_id: The ID of the Linode Disk that this Image will be created from.
        :param pulumi.Input[str] expiry: Only Images created automatically (from a deleted Linode; type=automatic) will expire.
        :param pulumi.Input[bool] is_public: True if the Image is public.
        :param pulumi.Input[str] label: A short description of the Image. Labels cannot contain special characters.
        :param pulumi.Input[int] linode_id: The ID of the Linode that this Image will be created from.
        :param pulumi.Input[int] size: The minimum size this Image needs to deploy. Size is in MB.
        :param pulumi.Input[str] type: How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from
               a deleted Linode.
        :param pulumi.Input[str] vendor: The upstream distribution vendor. Nil for private Images.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["created"] = created
        __props__["created_by"] = created_by
        __props__["deprecated"] = deprecated
        __props__["description"] = description
        __props__["disk_id"] = disk_id
        __props__["expiry"] = expiry
        __props__["is_public"] = is_public
        __props__["label"] = label
        __props__["linode_id"] = linode_id
        __props__["size"] = size
        __props__["type"] = type
        __props__["vendor"] = vendor
        return Image(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[str]:
        """
        When this Image was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> pulumi.Output[str]:
        """
        The name of the User who created this Image.
        """
        return pulumi.get(self, "created_by")

    @property
    @pulumi.getter
    def deprecated(self) -> pulumi.Output[bool]:
        """
        Whether or not this Image is deprecated. Will only be True for deprecated public Images.
        """
        return pulumi.get(self, "deprecated")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A detailed description of this Image.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="diskId")
    def disk_id(self) -> pulumi.Output[int]:
        """
        The ID of the Linode Disk that this Image will be created from.
        """
        return pulumi.get(self, "disk_id")

    @property
    @pulumi.getter
    def expiry(self) -> pulumi.Output[str]:
        """
        Only Images created automatically (from a deleted Linode; type=automatic) will expire.
        """
        return pulumi.get(self, "expiry")

    @property
    @pulumi.getter(name="isPublic")
    def is_public(self) -> pulumi.Output[bool]:
        """
        True if the Image is public.
        """
        return pulumi.get(self, "is_public")

    @property
    @pulumi.getter
    def label(self) -> pulumi.Output[str]:
        """
        A short description of the Image. Labels cannot contain special characters.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> pulumi.Output[int]:
        """
        The ID of the Linode that this Image will be created from.
        """
        return pulumi.get(self, "linode_id")

    @property
    @pulumi.getter
    def size(self) -> pulumi.Output[int]:
        """
        The minimum size this Image needs to deploy. Size is in MB.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from
        a deleted Linode.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def vendor(self) -> pulumi.Output[str]:
        """
        The upstream distribution vendor. Nil for private Images.
        """
        return pulumi.get(self, "vendor")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

