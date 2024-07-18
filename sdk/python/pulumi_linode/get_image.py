# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetImageResult',
    'AwaitableGetImageResult',
    'get_image',
    'get_image_output',
]

@pulumi.output_type
class GetImageResult:
    """
    A collection of values returned by getImage.
    """
    def __init__(__self__, capabilities=None, created=None, created_by=None, deprecated=None, description=None, expiry=None, id=None, is_public=None, label=None, size=None, status=None, type=None, vendor=None):
        if capabilities and not isinstance(capabilities, list):
            raise TypeError("Expected argument 'capabilities' to be a list")
        pulumi.set(__self__, "capabilities", capabilities)
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
        if created_by and not isinstance(created_by, str):
            raise TypeError("Expected argument 'created_by' to be a str")
        pulumi.set(__self__, "created_by", created_by)
        if deprecated and not isinstance(deprecated, bool):
            raise TypeError("Expected argument 'deprecated' to be a bool")
        pulumi.set(__self__, "deprecated", deprecated)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if expiry and not isinstance(expiry, str):
            raise TypeError("Expected argument 'expiry' to be a str")
        pulumi.set(__self__, "expiry", expiry)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_public and not isinstance(is_public, bool):
            raise TypeError("Expected argument 'is_public' to be a bool")
        pulumi.set(__self__, "is_public", is_public)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if size and not isinstance(size, int):
            raise TypeError("Expected argument 'size' to be a int")
        pulumi.set(__self__, "size", size)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if vendor and not isinstance(vendor, str):
            raise TypeError("Expected argument 'vendor' to be a str")
        pulumi.set(__self__, "vendor", vendor)

    @property
    @pulumi.getter
    def capabilities(self) -> Sequence[str]:
        return pulumi.get(self, "capabilities")

    @property
    @pulumi.getter
    def created(self) -> str:
        """
        When this Image was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> str:
        """
        The name of the User who created this Image, or "linode" for official Images.
        """
        return pulumi.get(self, "created_by")

    @property
    @pulumi.getter
    def deprecated(self) -> bool:
        """
        Whether or not this Image is deprecated. Will only be true for deprecated public Images.
        """
        return pulumi.get(self, "deprecated")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        A detailed description of this Image.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def expiry(self) -> str:
        return pulumi.get(self, "expiry")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isPublic")
    def is_public(self) -> bool:
        """
        True if the Image is public.
        """
        return pulumi.get(self, "is_public")

    @property
    @pulumi.getter
    def label(self) -> str:
        """
        A short description of the Image.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def size(self) -> int:
        """
        The minimum size this Image needs to deploy. Size is in MB. example: 2500
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The current status of this image. (`creating`, `pending_upload`, `available`)
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        How the Image was created. Manual Images can be created at any time. "Automatic" Images are created automatically from a deleted Linode. (`manual`, `automatic`)
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def vendor(self) -> str:
        """
        The upstream distribution vendor. `None` for private Images.
        """
        return pulumi.get(self, "vendor")


class AwaitableGetImageResult(GetImageResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetImageResult(
            capabilities=self.capabilities,
            created=self.created,
            created_by=self.created_by,
            deprecated=self.deprecated,
            description=self.description,
            expiry=self.expiry,
            id=self.id,
            is_public=self.is_public,
            label=self.label,
            size=self.size,
            status=self.status,
            type=self.type,
            vendor=self.vendor)


def get_image(id: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetImageResult:
    """
    Provides information about a Linode image
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-image).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode image.

    ```python
    import pulumi
    import pulumi_linode as linode

    k8_master = linode.get_image(id="linode/debian12")
    ```


    :param str id: The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getImage:getImage', __args__, opts=opts, typ=GetImageResult).value

    return AwaitableGetImageResult(
        capabilities=pulumi.get(__ret__, 'capabilities'),
        created=pulumi.get(__ret__, 'created'),
        created_by=pulumi.get(__ret__, 'created_by'),
        deprecated=pulumi.get(__ret__, 'deprecated'),
        description=pulumi.get(__ret__, 'description'),
        expiry=pulumi.get(__ret__, 'expiry'),
        id=pulumi.get(__ret__, 'id'),
        is_public=pulumi.get(__ret__, 'is_public'),
        label=pulumi.get(__ret__, 'label'),
        size=pulumi.get(__ret__, 'size'),
        status=pulumi.get(__ret__, 'status'),
        type=pulumi.get(__ret__, 'type'),
        vendor=pulumi.get(__ret__, 'vendor'))


@_utilities.lift_output_func(get_image)
def get_image_output(id: Optional[pulumi.Input[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetImageResult]:
    """
    Provides information about a Linode image
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-image).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode image.

    ```python
    import pulumi
    import pulumi_linode as linode

    k8_master = linode.get_image(id="linode/debian12")
    ```


    :param str id: The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
    """
    ...
