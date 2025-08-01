# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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
    'GetLkeVersionResult',
    'AwaitableGetLkeVersionResult',
    'get_lke_version',
    'get_lke_version_output',
]

@pulumi.output_type
class GetLkeVersionResult:
    """
    A collection of values returned by getLkeVersion.
    """
    def __init__(__self__, id=None, tier=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if tier and not isinstance(tier, str):
            raise TypeError("Expected argument 'tier' to be a str")
        pulumi.set(__self__, "tier", tier)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The Kubernetes version numbers available for deployment to a Kubernetes cluster in the format of [major].[minor], and the latest supported patch version.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def tier(self) -> _builtins.str:
        """
        The Kubernetes version tier. Only exported if `tier` was provided when using the datasource.
        """
        return pulumi.get(self, "tier")


class AwaitableGetLkeVersionResult(GetLkeVersionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLkeVersionResult(
            id=self.id,
            tier=self.tier)


def get_lke_version(id: Optional[_builtins.str] = None,
                    tier: Optional[_builtins.str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLkeVersionResult:
    """
    Provides details about a specific Kubernetes versions available for deployment to a Kubernetes cluster.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-lke-version).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode LKE Version.

    ```python
    import pulumi
    import pulumi_linode as linode

    example = linode.get_lke_version(id="1.31")
    ```

    The following example shows how one might use this data source to access information about a Linode LKE Version
    with additional information about the Linode LKE Version's tier (`enterprise` or `standard`).

    > **_NOTE:_**  This functionality may not be currently available to all users and can only be used with v4beta.

    ```python
    import pulumi
    import pulumi_linode as linode

    example = linode.get_lke_version(id="1.31",
        tier="standard")
    ```


    :param _builtins.str id: The unique ID of this Linode LKE Version.
    :param _builtins.str tier: The tier (`standard` or `enterprise`) of Linode LKE Version to fetch.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['tier'] = tier
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getLkeVersion:getLkeVersion', __args__, opts=opts, typ=GetLkeVersionResult).value

    return AwaitableGetLkeVersionResult(
        id=pulumi.get(__ret__, 'id'),
        tier=pulumi.get(__ret__, 'tier'))
def get_lke_version_output(id: Optional[pulumi.Input[_builtins.str]] = None,
                           tier: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetLkeVersionResult]:
    """
    Provides details about a specific Kubernetes versions available for deployment to a Kubernetes cluster.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-lke-version).

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode LKE Version.

    ```python
    import pulumi
    import pulumi_linode as linode

    example = linode.get_lke_version(id="1.31")
    ```

    The following example shows how one might use this data source to access information about a Linode LKE Version
    with additional information about the Linode LKE Version's tier (`enterprise` or `standard`).

    > **_NOTE:_**  This functionality may not be currently available to all users and can only be used with v4beta.

    ```python
    import pulumi
    import pulumi_linode as linode

    example = linode.get_lke_version(id="1.31",
        tier="standard")
    ```


    :param _builtins.str id: The unique ID of this Linode LKE Version.
    :param _builtins.str tier: The tier (`standard` or `enterprise`) of Linode LKE Version to fetch.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['tier'] = tier
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('linode:index/getLkeVersion:getLkeVersion', __args__, opts=opts, typ=GetLkeVersionResult)
    return __ret__.apply(lambda __response__: GetLkeVersionResult(
        id=pulumi.get(__response__, 'id'),
        tier=pulumi.get(__response__, 'tier')))
