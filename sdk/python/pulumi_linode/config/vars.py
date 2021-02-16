# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = [
    'api_version',
    'max_retry_delay_ms',
    'min_retry_delay_ms',
    'skip_instance_ready_poll',
    'token',
    'ua_prefix',
    'url',
]

__config__ = pulumi.Config('linode')

api_version = __config__.get('apiVersion') or _utilities.get_env('LINODE_API_VERSION')
"""
An HTTP User-Agent Prefix to prepend in API requests.
"""

max_retry_delay_ms = __config__.get('maxRetryDelayMs')
"""
Maximum delay in milliseconds before retrying a request.
"""

min_retry_delay_ms = __config__.get('minRetryDelayMs')
"""
Minimum delay in milliseconds before retrying a request.
"""

skip_instance_ready_poll = __config__.get('skipInstanceReadyPoll')
"""
Skip waiting for a linode_instance resource to be running.
"""

token = __config__.get('token')
"""
The token that allows you access to your Linode account
"""

ua_prefix = __config__.get('uaPrefix') or _utilities.get_env('LINODE_UA_PREFIX')
"""
An HTTP User-Agent Prefix to prepend in API requests.
"""

url = __config__.get('url') or _utilities.get_env('LINODE_URL')
"""
The HTTP(S) API address of the Linode API to use.
"""

