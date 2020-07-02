# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

__config__ = pulumi.Config('linode')

api_version = __config__.get('apiVersion') or utilities.get_env('LINODE_API_VERSION')
"""
An HTTP User-Agent Prefix to prepend in API requests.
"""

token = __config__.get('token') or utilities.get_env('LINODE_TOKEN', 'LINODE_API_TOKEN')
"""
The token that allows you access to your Linode account
"""

ua_prefix = __config__.get('uaPrefix') or utilities.get_env('LINODE_UA_PREFIX')
"""
An HTTP User-Agent Prefix to prepend in API requests.
"""

url = __config__.get('url') or utilities.get_env('LINODE_URL')
"""
The HTTP(S) API address of the Linode API to use.
"""

