# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class GetRegionResult:
    """
    A collection of values returned by getRegion.
    """
    def __init__(__self__, country=None, id=None):
        if country and not isinstance(country, str):
            raise TypeError("Expected argument 'country' to be a str")
        __self__.country = country
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
class AwaitableGetRegionResult(GetRegionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRegionResult(
            country=self.country,
            id=self.id)

def get_region(country=None,id=None,opts=None):
    """
    `.getRegion` provides details about a specific Linode region.

    > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/region.html.markdown.
    """
    __args__ = dict()

    __args__['country'] = country
    __args__['id'] = id
    if opts is None:
        opts = pulumi.ResourceOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('linode:index/getRegion:getRegion', __args__, opts=opts).value

    return AwaitableGetRegionResult(
        country=__ret__.get('country'),
        id=__ret__.get('id'))
