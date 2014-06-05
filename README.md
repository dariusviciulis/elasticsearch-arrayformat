
# Elasticsearch arrayformat plugin

This plugin offers array format for REST search responses.

## Example

    
    curl '0:9200/_search'
    {"took":28,"timed_out":false,"_shards":{"total":5,"successful":5,"failed":0},"hits":{"total":4,"max_score":1.0,"hits":[{"_index":"test","_type":"docs","_id":"3","_score":1.0,"_source":
    {
        "content" : "baz foo"
    }
    },{"_index":"test","_type":"docs","_id":"1","_score":1.0,"_source":
    {
        "content" : "foobar baz"
    }
    },{"_index":"test","_type":"docs","_id":"2","_score":1.0,"_source":
    {
        "content" : "foo baz"
    }
    },{"_index":"test","_type":"docs","_id":"4","_score":1.0,"_source":
    {
        "content" : "foo bazilion"
    }
    }]}}
    
    
    
    curl '0:9200/_search_arrayformat?pretty'
    [ {
      "content" : "baz foo"
    }, {
      "content" : "foobar baz"
    }, {
      "content" : "foo baz"
    }, {
      "content" : "foo bazilion"
    } ]


## Versions

| Elasticsearch version    | Plugin      | Release date |
| ------------------------ | ----------- | -------------|
| 1.2.1                    | 1.2.1.0     | Jun  5, 2014 |

## Installation

```
./bin/plugin -install support -url http://xbib.org/repository/org/xbib/elasticsearch/plugin/elasticsearch-arrayformat/1.2.1.0/elasticsearch-arrayformat-1.2.1.0.zip
```

Do not forget to restart the node after installing.

## Checksum

| File                                          | SHA1                                     |
| --------------------------------------------- | -----------------------------------------|
| elasticsearch-arrayformat-1.2.1.0.zip         | af3dbaa0e35729ec83d201050808fa035775547c |

## Project docs

The Maven project site is available at `Github <http://jprante.github.io/elasticsearch-arrayformat>`_

## Issues

All feedback is welcome! If you find issues, please post them at `Github <https://github.com/jprante/elasticsearch-arrayformat/issues>`_

# License

Elasticsearch Support Plugin

Copyright (C) 2013 Jörg Prante

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.