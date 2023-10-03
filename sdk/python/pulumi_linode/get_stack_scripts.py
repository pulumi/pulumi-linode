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
    'GetStackScriptsResult',
    'AwaitableGetStackScriptsResult',
    'get_stack_scripts',
    'get_stack_scripts_output',
]

@pulumi.output_type
class GetStackScriptsResult:
    """
    A collection of values returned by getStackScripts.
    """
    def __init__(__self__, filters=None, id=None, latest=None, order=None, order_by=None, stackscripts=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if latest and not isinstance(latest, bool):
            raise TypeError("Expected argument 'latest' to be a bool")
        pulumi.set(__self__, "latest", latest)
        if order and not isinstance(order, str):
            raise TypeError("Expected argument 'order' to be a str")
        pulumi.set(__self__, "order", order)
        if order_by and not isinstance(order_by, str):
            raise TypeError("Expected argument 'order_by' to be a str")
        pulumi.set(__self__, "order_by", order_by)
        if stackscripts and not isinstance(stackscripts, list):
            raise TypeError("Expected argument 'stackscripts' to be a list")
        pulumi.set(__self__, "stackscripts", stackscripts)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetStackScriptsFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The unique ID of the StackScript.
        """
        return pulumi.get(self, "id")

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

    @property
    @pulumi.getter
    def stackscripts(self) -> Optional[Sequence['outputs.GetStackScriptsStackscriptResult']]:
        return pulumi.get(self, "stackscripts")


class AwaitableGetStackScriptsResult(GetStackScriptsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStackScriptsResult(
            filters=self.filters,
            id=self.id,
            latest=self.latest,
            order=self.order,
            order_by=self.order_by,
            stackscripts=self.stackscripts)


def get_stack_scripts(filters: Optional[Sequence[pulumi.InputType['GetStackScriptsFilterArgs']]] = None,
                      latest: Optional[bool] = None,
                      order: Optional[str] = None,
                      order_by: Optional[str] = None,
                      stackscripts: Optional[Sequence[pulumi.InputType['GetStackScriptsStackscriptArgs']]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStackScriptsResult:
    """
    Provides information about Linode StackScripts that match a set of filters.

    **NOTICE:** Due to the large number of public StackScripts, this data source may time out if `is_public` is not filtered on.

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode StackScript.

    ```python
    import pulumi
    import pulumi_linode as linode

    specific_stackscripts = linode.get_stack_scripts(filters=[
        linode.GetStackScriptsFilterArgs(
            name="label",
            values=["my-cool-stackscript"],
        ),
        linode.GetStackScriptsFilterArgs(
            name="is_public",
            values=["false"],
        ),
    ])
    pulumi.export("stackscriptId", specific_stackscripts.stackscripts[0].id)
    ```
    ## Filterable Fields

    * `deployments_active`

    * `deployments_total`

    * `description`

    * `images`

    * `is_public`

    * `label`

    * `mine`

    * `rev_note`

    * `username`


    :param bool latest: If true, only the latest StackScript will be returned. StackScripts without a valid `created` field are not included in the result.
           
           * `filter` - (Optional) A set of filters used to select Linode StackScripts that meet certain requirements.
    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['latest'] = latest
    __args__['order'] = order
    __args__['orderBy'] = order_by
    __args__['stackscripts'] = stackscripts
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getStackScripts:getStackScripts', __args__, opts=opts, typ=GetStackScriptsResult).value

    return AwaitableGetStackScriptsResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        latest=pulumi.get(__ret__, 'latest'),
        order=pulumi.get(__ret__, 'order'),
        order_by=pulumi.get(__ret__, 'order_by'),
        stackscripts=pulumi.get(__ret__, 'stackscripts'))


@_utilities.lift_output_func(get_stack_scripts)
def get_stack_scripts_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetStackScriptsFilterArgs']]]]] = None,
                             latest: Optional[pulumi.Input[Optional[bool]]] = None,
                             order: Optional[pulumi.Input[Optional[str]]] = None,
                             order_by: Optional[pulumi.Input[Optional[str]]] = None,
                             stackscripts: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetStackScriptsStackscriptArgs']]]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetStackScriptsResult]:
    """
    Provides information about Linode StackScripts that match a set of filters.

    **NOTICE:** Due to the large number of public StackScripts, this data source may time out if `is_public` is not filtered on.

    ## Example Usage

    The following example shows how one might use this data source to access information about a Linode StackScript.

    ```python
    import pulumi
    import pulumi_linode as linode

    specific_stackscripts = linode.get_stack_scripts(filters=[
        linode.GetStackScriptsFilterArgs(
            name="label",
            values=["my-cool-stackscript"],
        ),
        linode.GetStackScriptsFilterArgs(
            name="is_public",
            values=["false"],
        ),
    ])
    pulumi.export("stackscriptId", specific_stackscripts.stackscripts[0].id)
    ```
    ## Filterable Fields

    * `deployments_active`

    * `deployments_total`

    * `description`

    * `images`

    * `is_public`

    * `label`

    * `mine`

    * `rev_note`

    * `username`


    :param bool latest: If true, only the latest StackScript will be returned. StackScripts without a valid `created` field are not included in the result.
           
           * `filter` - (Optional) A set of filters used to select Linode StackScripts that meet certain requirements.
    :param str order: The order in which results should be returned. (`asc`, `desc`; default `asc`)
    :param str order_by: The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
    """
    ...
