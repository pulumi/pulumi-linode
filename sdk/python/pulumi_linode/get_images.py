# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetImagesResult',
    'AwaitableGetImagesResult',
    'get_images',
    'get_images_output',
]

@pulumi.output_type
class GetImagesResult:
    """
    A collection of values returned by getImages.
    """
    def __init__(__self__, filters=None, id=None, images=None, latest=None, order=None, order_by=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if images and not isinstance(images, list):
            raise TypeError("Expected argument 'images' to be a list")
        pulumi.set(__self__, "images", images)
        if latest and not isinstance(latest, bool):
            raise TypeError("Expected argument 'latest' to be a bool")
        pulumi.set(__self__, "latest", latest)
        if order and not isinstance(order, str):
            raise TypeError("Expected argument 'order' to be a str")
        pulumi.set(__self__, "order", order)
        if order_by and not isinstance(order_by, str):
            raise TypeError("Expected argument 'order_by' to be a str")
        pulumi.set(__self__, "order_by", order_by)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetImagesFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def images(self) -> Optional[Sequence['outputs.GetImagesImageResult']]:
        return pulumi.get(self, "images")

    @property
    @pulumi.getter
    def latest(self) -> Optional[bool]:
        return pulumi.get(self, "latest")

    @property
    @pulumi.getter
    def order(self) -> Optional[str]:
        return pulumi.get(self, "order")

    @property
    @pulumi.getter(name="orderBy")
    def order_by(self) -> Optional[str]:
        return pulumi.get(self, "order_by")


class AwaitableGetImagesResult(GetImagesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetImagesResult(
            filters=self.filters,
            id=self.id,
            images=self.images,
            latest=self.latest,
            order=self.order,
            order_by=self.order_by)


def get_images(filters: Optional[Sequence[pulumi.InputType['GetImagesFilterArgs']]] = None,
               images: Optional[Sequence[pulumi.InputType['GetImagesImageArgs']]] = None,
               latest: Optional[bool] = None,
               order: Optional[str] = None,
               order_by: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetImagesResult:
    """
    Provides information about Linode images that match a set of filters.

    ## Example Usage

    Get information about all Linode images with a certain label and visibility:

    ```python
    import pulumi
    import pulumi_linode as linode

    specific_images = linode.get_images(filters=[
        linode.GetImagesFilterArgs(
            name="label",
            values=["Debian 11"],
        ),
        linode.GetImagesFilterArgs(
            name="is_public",
            values=["true"],
        ),
    ])
    pulumi.export("imageId", specific_images.images[0].id)
    ```

    Get information about all Linode images associated with the current token:

    ```python
    import pulumi
    import pulumi_linode as linode

    all_images = linode.get_images()
    pulumi.export("imageIds", [__item.id for __item in all_images.images])
    ```
    ## Filterable Fields

    * `created_by`

    * `deprecated`

    * `description`

    * `id`

    * `is_public`

    * `label`

    * `size`

    * `status`

    * `vendor`


    :param bool latest: If true, only the latest image will be returned. Images without a valid `created` field are not included in the result.
           
           * `filter` - (Optional) A set of filters used to select Linode images that meet certain requirements.
    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['images'] = images
    __args__['latest'] = latest
    __args__['order'] = order
    __args__['orderBy'] = order_by
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getImages:getImages', __args__, opts=opts, typ=GetImagesResult).value

    return AwaitableGetImagesResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        images=pulumi.get(__ret__, 'images'),
        latest=pulumi.get(__ret__, 'latest'),
        order=pulumi.get(__ret__, 'order'),
        order_by=pulumi.get(__ret__, 'order_by'))


@_utilities.lift_output_func(get_images)
def get_images_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetImagesFilterArgs']]]]] = None,
                      images: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetImagesImageArgs']]]]] = None,
                      latest: Optional[pulumi.Input[Optional[bool]]] = None,
                      order: Optional[pulumi.Input[Optional[str]]] = None,
                      order_by: Optional[pulumi.Input[Optional[str]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetImagesResult]:
    """
    Provides information about Linode images that match a set of filters.

    ## Example Usage

    Get information about all Linode images with a certain label and visibility:

    ```python
    import pulumi
    import pulumi_linode as linode

    specific_images = linode.get_images(filters=[
        linode.GetImagesFilterArgs(
            name="label",
            values=["Debian 11"],
        ),
        linode.GetImagesFilterArgs(
            name="is_public",
            values=["true"],
        ),
    ])
    pulumi.export("imageId", specific_images.images[0].id)
    ```

    Get information about all Linode images associated with the current token:

    ```python
    import pulumi
    import pulumi_linode as linode

    all_images = linode.get_images()
    pulumi.export("imageIds", [__item.id for __item in all_images.images])
    ```
    ## Filterable Fields

    * `created_by`

    * `deprecated`

    * `description`

    * `id`

    * `is_public`

    * `label`

    * `size`

    * `status`

    * `vendor`


    :param bool latest: If true, only the latest image will be returned. Images without a valid `created` field are not included in the result.
           
           * `filter` - (Optional) A set of filters used to select Linode images that meet certain requirements.
    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    ...
