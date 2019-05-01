# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class Image(pulumi.CustomResource):
    created: pulumi.Output[str]
    created_by: pulumi.Output[str]
    deprecated: pulumi.Output[bool]
    description: pulumi.Output[str]
    """
    A detailed description of this Image.
    """
    disk_id: pulumi.Output[float]
    """
    The ID of the Linode Disk that this Image will be created from.
    """
    expiry: pulumi.Output[str]
    is_public: pulumi.Output[bool]
    label: pulumi.Output[str]
    """
    A short description of the Image. Labels cannot contain special characters.
    """
    linode_id: pulumi.Output[float]
    """
    The ID of the Linode that this Image will be created from.
    """
    size: pulumi.Output[float]
    type: pulumi.Output[str]
    vendor: pulumi.Output[str]
    def __init__(__self__, resource_name, opts=None, description=None, disk_id=None, label=None, linode_id=None, __name__=None, __opts__=None):
        """
        Provides a Linode Image resource.  This can be used to create, modify, and delete Linodes Images.  Linode Images are snapshots of a Linode Instance Disk which can then be used to provision more Linode Instances.  Images can be used across regions.
        
        For more information, see [Linode's documentation on Images](https://www.linode.com/docs/platform/disk-images/linode-images/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createImage).
        
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
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A detailed description of this Image.
        :param pulumi.Input[float] disk_id: The ID of the Linode Disk that this Image will be created from.
        :param pulumi.Input[str] label: A short description of the Image. Labels cannot contain special characters.
        :param pulumi.Input[float] linode_id: The ID of the Linode that this Image will be created from.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if not resource_name:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(resource_name, str):
            raise TypeError('Expected resource name to be a string')
        if opts and not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        __props__['description'] = description

        if disk_id is None:
            raise TypeError("Missing required property 'disk_id'")
        __props__['disk_id'] = disk_id

        if label is None:
            raise TypeError("Missing required property 'label'")
        __props__['label'] = label

        if linode_id is None:
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


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

