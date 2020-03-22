# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class GetImageResult:
    """
    A collection of values returned by getImage.
    """
    def __init__(__self__, created=None, created_by=None, deprecated=None, description=None, expiry=None, id=None, is_public=None, label=None, size=None, type=None, vendor=None):
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        __self__.created = created
        if created_by and not isinstance(created_by, str):
            raise TypeError("Expected argument 'created_by' to be a str")
        __self__.created_by = created_by
        if deprecated and not isinstance(deprecated, bool):
            raise TypeError("Expected argument 'deprecated' to be a bool")
        __self__.deprecated = deprecated
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        __self__.description = description
        if expiry and not isinstance(expiry, str):
            raise TypeError("Expected argument 'expiry' to be a str")
        __self__.expiry = expiry
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        if is_public and not isinstance(is_public, bool):
            raise TypeError("Expected argument 'is_public' to be a bool")
        __self__.is_public = is_public
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        __self__.label = label
        if size and not isinstance(size, float):
            raise TypeError("Expected argument 'size' to be a float")
        __self__.size = size
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        __self__.type = type
        if vendor and not isinstance(vendor, str):
            raise TypeError("Expected argument 'vendor' to be a str")
        __self__.vendor = vendor
class AwaitableGetImageResult(GetImageResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetImageResult(
            created=self.created,
            created_by=self.created_by,
            deprecated=self.deprecated,
            description=self.description,
            expiry=self.expiry,
            id=self.id,
            is_public=self.is_public,
            label=self.label,
            size=self.size,
            type=self.type,
            vendor=self.vendor)

def get_image(id=None,opts=None):
    """
    Provides information about a Linode image

    ## Attributes

    The Linode Image resource exports the following attributes:

    * `label` - A short description of the Image.

    * `created` - When this Image was created.

    * `created_by` - The name of the User who created this Image, or "linode" for official Images.

    * `deprecated` - Whether or not this Image is deprecated. Will only be true for deprecated public Images.

    * `description` - A detailed description of this Image.

    * `is_public` - True if the Image is public.

    * `size` - The minimum size this Image needs to deploy. Size is in MB. example: 2500

    * `type` - How the Image was created. Manual Images can be created at any time. image"Automatic" Images are created automatically from a deleted Linode.

    * `vendor` - The upstream distribution vendor. `None` for private Images. 

    > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/image.html.md.


    :param str id: The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
    """
    __args__ = dict()


    __args__['id'] = id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('linode:index/getImage:getImage', __args__, opts=opts).value

    return AwaitableGetImageResult(
        created=__ret__.get('created'),
        created_by=__ret__.get('createdBy'),
        deprecated=__ret__.get('deprecated'),
        description=__ret__.get('description'),
        expiry=__ret__.get('expiry'),
        id=__ret__.get('id'),
        is_public=__ret__.get('isPublic'),
        label=__ret__.get('label'),
        size=__ret__.get('size'),
        type=__ret__.get('type'),
        vendor=__ret__.get('vendor'))
