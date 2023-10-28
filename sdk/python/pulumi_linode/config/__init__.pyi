# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

apiVersion: Optional[str]
"""
The version of Linode API.
"""

configPath: Optional[str]

configProfile: Optional[str]

disableInternalCache: Optional[bool]
"""
Disable the internal caching system that backs certain Linode API requests.
"""

eventPollMs: Optional[int]
"""
The rate in milliseconds to poll for events.
"""

lkeEventPollMs: Optional[int]
"""
The rate in milliseconds to poll for LKE events.
"""

lkeNodeReadyPollMs: Optional[int]
"""
The rate in milliseconds to poll for an LKE node to be ready.
"""

maxRetryDelayMs: Optional[int]
"""
Maximum delay in milliseconds before retrying a request.
"""

minRetryDelayMs: Optional[int]
"""
Minimum delay in milliseconds before retrying a request.
"""

skipImplicitReboots: Optional[bool]
"""
If true, Linode Instances will not be rebooted on config and interface changes.
"""

skipInstanceDeletePoll: Optional[bool]
"""
Skip waiting for a linode_instance resource to finish deleting.
"""

skipInstanceReadyPoll: Optional[bool]
"""
Skip waiting for a linode_instance resource to be running.
"""

token: Optional[str]
"""
The token that allows you access to your Linode account
"""

uaPrefix: Optional[str]
"""
An HTTP User-Agent Prefix to prepend in API requests.
"""

url: Optional[str]
"""
The HTTP(S) API address of the Linode API to use.
"""

